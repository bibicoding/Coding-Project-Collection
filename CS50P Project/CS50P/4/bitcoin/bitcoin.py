import requests
import sys

def main():
    try:
        if len(sys.argv) != 2:
            sys.exit("Missing command-line argument")

        try:
            n = float(sys.argv[1])
            val = requests.get("https://api.coindesk.com/v1/bpi/currentprice.json")
            rate = val.json()["bpi"]["USD"]["rate_float"]

            currency = n * rate
            print(f"${currency:,.4f}")

        except ValueError:
            sys.exit("Command-line argument is not a number")


    except requests.RequestException:
        sys.exit()


main()
