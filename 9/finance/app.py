import os

from cs50 import SQL
from flask import Flask, flash, redirect, render_template, request, session
from flask_session import Session
from werkzeug.security import check_password_hash, generate_password_hash
import datetime

from helpers import apology, login_required, lookup, usd

# Configure application
app = Flask(__name__)

# Ensure templates are auto-reloaded
app.config["TEMPLATES_AUTO_RELOAD"] = True

# Make sure API key is set
# if not os.environ.get("API_KEY"):
# raise RuntimeError("API_KEY not set")

# Custom filter
app.jinja_env.filters["usd"] = usd

# Configure session to use filesystem (instead of signed cookies)
app.config["SESSION_PERMANENT"] = False
app.config["SESSION_TYPE"] = "filesystem"
Session(app)

# Configure CS50 Library to use SQLite database
db = SQL("sqlite:///finance.db")


@app.after_request
def after_request(response):
    """Ensure responses aren't cached"""
    response.headers["Cache-Control"] = "no-cache, no-store, must-revalidate"
    response.headers["Expires"] = 0
    response.headers["Pragma"] = "no-cache"
    return response


@app.route("/")
@login_required
def index():
    """Show portfolio of stocks"""
    user_id = session["user_id"]

    transactions_db = db.execute(
        "SELECT symbol, SUM(shares) as shares, price FROM transactions WHERE user_id = ? GROUP BY symbol HAVING SUM(shares) > 0", user_id)
    cash_db = db.execute("SELECT cash FROM users WHERE id = ?", user_id)
    cash = cash_db[0]["cash"]

    if not transactions_db:
        transactions_db = []

    total_stock_value = 0

    for transaction in transactions_db:
        stock = lookup(transaction["symbol"])
        total_stock_value += transaction["shares"] * stock["price"]

    total_value = cash + total_stock_value

    return render_template("index.html", database=transactions_db, cash=cash, total_value=total_value)


@app.route("/buy", methods=["GET", "POST"])
@login_required
def buy():
    """Buy shares of stock"""
    if request.method == "GET":
        return render_template("buy.html")
    else:
        symbol = request.form.get("symbol")
        shares = request.form.get("shares")

        if not shares.isdigit() or int(shares) <= 0:
            return apology("Invalid number of shares")

        shares = int(shares)

        if not symbol:
            return apology("Missing Symbol")

        stock = lookup(symbol.upper())

        if stock == None:
            return apology("Invalid Symbol")

        price = stock["price"]

        total_cost = shares * price

        user_id = session["user_id"]
        user_cash_db = db.execute("SELECT cash FROM users WHERE id = ?", user_id)
        user_cash = user_cash_db[0]["cash"]

        if total_cost > user_cash:
            return apology("Can't Afford")

        new_cash = user_cash - total_cost

        db.execute("UPDATE users SET cash = ? WHERE id = ?", new_cash, user_id)

        date = datetime.datetime.now()

        db.execute("INSERT INTO transactions (user_id, symbol, shares, price, date) VALUES (?, ?, ?, ?, ?)",
                   user_id, stock["symbol"], shares, price, date)

        flash("Bought!")

        return redirect("/")


@app.route("/history")
@login_required
def history():
    """Show history of transactions"""
    user_id = session["user_id"]
    transactions_db = db.execute("SELECT * FROM transactions WHERE user_id = ?", user_id)
    return render_template("history.html", transactions=transactions_db)


@app.route("/login", methods=["GET", "POST"])
def login():
    """Log user in"""

    # Forget any user_id
    session.clear()

    # User reached route via POST (as by submitting a form via POST)
    if request.method == "POST":
        # Ensure username was submitted
        if not request.form.get("username"):
            return apology("must provide username", 403)

        # Ensure password was submitted
        elif not request.form.get("password"):
            return apology("must provide password", 403)

        # Query database for username
        rows = db.execute(
            "SELECT * FROM users WHERE username = ?", request.form.get("username")
        )

        # Ensure username exists and password is correct
        if len(rows) != 1 or not check_password_hash(
            rows[0]["hash"], request.form.get("password")
        ):
            return apology("invalid username and/or password", 403)

        # Remember which user has logged in
        session["user_id"] = rows[0]["id"]

        # Redirect user to home page
        return redirect("/")

    # User reached route via GET (as by clicking a link or via redirect)
    else:
        return render_template("login.html")


@app.route("/logout")
def logout():
    """Log user out"""

    # Forget any user_id
    session.clear()

    # Redirect user to login form
    return redirect("/")


@app.route("/quote", methods=["GET", "POST"])
@login_required
def quote():
    """Get stock quote."""

    if request.method == "GET":
        return render_template("quote.html")
    else:
        symbol = request.form.get("symbol")

        if not symbol:
            return apology("Missing Symbol")

        stock = lookup(symbol.upper())

        if stock == None:
            return apology("Invalid Symbol")

        price = stock["price"]

        return render_template("quoted.html", name=stock["name"], price=price, symbol=stock["symbol"])


@app.route("/register", methods=["GET", "POST"])
def register():
    """Register user"""

    if request.method == "GET":
        return render_template("register.html")
    else:
        username = request.form.get("username")
        password = request.form.get("password")
        confirm = request.form.get("confirmation")

        # Check if any info is submitted blank
        # If so, lead to apology page

        if not username:
            return apology("Did not enter Username")
        if not password:
            return apology("Did not enter Password")
        if not confirm:
            return apology("Did not confirm Password")

        # Check if the confirmation of password is correct

        if not password == confirm:
            return apology("Passwords do not Match")

        hash = generate_password_hash(password)

        try:
            new_user = db.execute(
                "INSERT INTO users (username, hash) VALUES (?, ?)", username, hash)
        except:
            return apology("User already exists")

        session["user_id"] = new_user
        return redirect("/")


@app.route("/changepass", methods=["GET", "POST"])
@login_required
def changepass():
    """Change User Password"""
    if request.method == "GET":
        return render_template("changepass.html")
    else:
        user_id = session["user_id"]
        new_pass = request.form.get("new_password")
        confirm = request.form.get("confirmation")

        if not new_pass:
            return apology("Please enter new password")
        if not confirm:
            return apology("Please confirm your new password")
        if not new_pass == confirm:
            return apology("Passwords do not match")

        old_hash = db.execute("SELECT hash FROM users WHERE id = ?", user_id)[0]["hash"]

        # Check if new password differs from old one
        if check_password_hash(old_hash, new_pass):
            return apology("Please enter a new password")

        new_hash = generate_password_hash(new_pass)
        db.execute("UPDATE users SET hash = ? WHERE id = ?", new_hash, user_id)
        return redirect("/")


@app.route("/sell", methods=["GET", "POST"])
@login_required
def sell():
    """Sell shares of stock"""
    if request.method == "GET":
        user_id = session["user_id"]
        symbols_user = db.execute(
            "SELECT symbol FROM transactions WHERE user_id = ? GROUP BY symbol HAVING SUM(shares) > 0", user_id)
        return render_template("sell.html", symbols=[row["symbol"] for row in symbols_user])
    else:
        symbol = request.form.get("symbol")
        shares = request.form.get("shares")

        if not shares.isdigit() or int(shares) <= 0:
            return apology("Invalid number of shares")

        shares = int(shares)

        if not symbol:
            return apology("Missing Symbol")

        if shares <= 0:
            return apology("Share must be positive")

        stock = lookup(symbol.upper())

        user_id = session["user_id"]
        user_cash_db = db.execute("SELECT cash FROM users WHERE id = ?", user_id)
        user_cash = user_cash_db[0]["cash"]

        user_shares = db.execute(
            "SELECT SUM(shares) as shares FROM transactions WHERE user_id = ? AND symbol = ? GROUP BY symbol", user_id, symbol)
        user_shares_real = user_shares[0]["shares"]

        if shares > user_shares_real:
            return apology("Not enough shares")

        price = stock["price"]

        transaction_value = shares * price

        user_id = session["user_id"]
        user_cash_db = db.execute("SELECT cash FROM users WHERE id = ?", user_id)
        user_cash = user_cash_db[0]["cash"]

        user_shares = db.execute(
            "SELECT SUM(shares) as shares FROM transactions WHERE user_id = ? AND symbol = ? GROUP BY symbol", user_id, symbol)
        user_shares_real = user_shares[0]["shares"]

        if shares > user_shares_real:
            return apology("You Do Not Have This Amount Of Shares")

        uptd_cash = user_cash + transaction_value

        db.execute("UPDATE users SET cash = ? WHERE id = ?", uptd_cash, user_id)

        date = datetime.datetime.now()

        db.execute("INSERT INTO transactions (user_id, symbol, shares, price, date) VALUES (?, ?, ?, ?, ?)",
                   user_id, stock["symbol"], (-1)*shares, price, date)

        flash("Sold!")

        return redirect("/")
