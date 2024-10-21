from cs50 import SQL
from flask import Flask, flash, redirect, render_template, request, session
from flask_session import Session
from werkzeug.security import check_password_hash, generate_password_hash
import datetime

from helpers import login_required

# Configure Application
app = Flask(__name__)

# Ensure templates are auto-reloaded
app.config["TEMPLATES_AUTO_RELOAD"] = True

# Configure session to use filesystem (instead of signed cookies)
app.config["SESSION_PERMANENT"] = False
app.config["SESSION_TYPE"] = "filesystem"
Session(app)

# Configure CS50 Library to use SQLite database
db = SQL("sqlite:///health.db")


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
    """Show Default Homepage"""
    user_id = session["user_id"]
    username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]

    # Display username on NavBar
    return render_template("index.html", username=username)


@app.route("/register", methods=["GET", "POST"])
def register():
    """Register User"""

    if request.method == "GET":
        return render_template("register.html")
    else:
        username = request.form.get("username")
        password = request.form.get("password")
        confirm = request.form.get("confirmation")

        # Check if user filled in all the blank forms
        # If not, redirect to registration page

        if not username:
            flash("Please Enter a Username")
            return render_template("register.html")
        if not password:
            flash("Please Enter a Password")
            return render_template("register.html")
        if not confirm:
            flash("Please Confirm Your Password")
            return render_template("register.html")

        # Check if password and confirmation password matches

        if not password == confirm:
            flash("Passwords do not match")
            return render_template("register.html")

        # Generate Hash for user's password

        hash = generate_password_hash(password)

        # Check if entered Username already exists in database

        try:
            new_user = db.execute(
                "INSERT INTO users (username, hash) VALUES (?, ?)", username, hash)
        except:
            flash("User Already Exists")
            return render_template("register.html")

        session["user_id"] = new_user
        return redirect("/")


@app.route("/login", methods=["GET", "POST"])
def login():
    """Login User"""

    # Forget any user_id
    session.clear()

    if request.method == "POST":
        username = request.form.get("username")
        password = request.form.get("password")

        if not username:
            flash("Please Enter Your Username")
            return render_template("login.html")

        if not password:
            flash("Please Enter Your Password")
            return render_template("login.html")

        rows = db.execute(
            "SELECT * FROM users WHERE username = ?", request.form.get("username")
        )

        if len(rows) != 1 or not check_password_hash(
            rows[0]["hash"], request.form.get("password")
        ):
            flash("Incorrect Username or Password")
            return render_template("login.html")

        # Remember which user has logged in
        session["user_id"] = rows[0]["id"]

        # Proceed with login
        return redirect("/")

    else:
        return render_template("login.html")


@app.route("/logout")
def logout():
    """Log user out"""

    # Forget any user_id
    session.clear()

    # Redirect user to login form
    return redirect("/")


@app.route("/about")
@login_required
def about():
    """Show Info"""

    user_id = session["user_id"]
    username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]

    # Display username on NavBar
    return render_template("about.html", username=username)


@app.route("/mkapmt", methods=["GET", "POST"])
@login_required
def make_appointments():
    """Lead to appointments page"""
    if request.method == "GET":
        user_id = session["user_id"]
        username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]

        # Display username on NavBar
        return render_template("mkapmt.html", username=username)
    else:
        user_id = session["user_id"]
        username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]

        institute = request.form.get("institute")
        apmt_type = request.form.get("type")
        apmt_date = request.form.get("date")

        if not institute or not apmt_type or not apmt_date:
            flash("All fields are required to make your appointment!")
            return render_template("mkapmt.html", username=username)

        reg_time = datetime.datetime.now()

        try:
            db.execute("INSERT INTO appointments (user_id, institute, type, register_time, apmt_date) VALUES (?, ?, ?, ?, ?)",
                       user_id, institute, apmt_type, reg_time, apmt_date)
        except:
            flash("Appointment already exists")
            return render_template("mkapmt.html", username=username)

        flash("Appointment Made Successfully")
        return render_template("mkapmt.html", username=username)


@app.route("/fdinst")
@login_required
def find_institutions():
    """Show Institutions"""

    user_id = session["user_id"]
    username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]

    # Display username on NavBar
    return render_template("fdinst.html", username=username)


@app.route("/contact")
@login_required
def contact():
    """Our contact info"""

    user_id = session["user_id"]
    username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]

    # Display username on NavBar
    return render_template("contact.html", username=username)


@app.route("/changepass", methods=["GET", "POST"])
@login_required
def changepass():
    """Change User Password"""

    if request.method == "GET":
        user_id = session["user_id"]
        username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]

        # Display username on NavBar
        return render_template("changepass.html", username=username)

    else:
        user_id = session["user_id"]
        username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]
        new_pass = request.form.get("new_password")
        confirm = request.form.get("confirmation")

        if not new_pass:
            flash("Please enter new password")
            return render_template("changepass.html", username=username)
        if not confirm:
            flash("Please confirm your new password")
            return render_template("changepass.html", username=username)
        if not new_pass == confirm:
            flash("Passwords do not match")
            return render_template("changepass.html", username=username)

        old_hash = db.execute("SELECT hash FROM users WHERE id = ?", user_id)[0]["hash"]

        # Check if new password differs from old one
        if check_password_hash(old_hash, new_pass):
            flash("Please enter a new password")
            return render_template("changepass.html", username=username)

        new_hash = generate_password_hash(new_pass)
        db.execute("UPDATE users SET hash = ? WHERE id = ?", new_hash, user_id)
        return redirect("/")


@app.route("/activities")
@login_required
def activities():
    """Show user's 10 recent activities"""
    """Show past appointments made and allow user to delete"""

    user_id = session["user_id"]
    appointments = db.execute(
        "SELECT institute, type, apmt_date, register_time FROM appointments WHERE user_id = ? ORDER BY register_time DESC LIMIT 10", user_id)
    username = db.execute("SELECT username FROM users WHERE id = ?", user_id)[0]["username"]

    # Display username on NavBar
    return render_template("activities.html", username=username, appointments=appointments)
