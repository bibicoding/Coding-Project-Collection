import re
import math

def main():
    verify_card(input("Number: "))


def verify_card(num):

    if verify_digits(int(num)):

        if re.search(r"^3(4|7)\d{13}$", num):
            print("AMEX")

        elif re.search(r"^5[1-5]\d{14}$", num):
            print("MASTERCARD")

        elif re.search(r"^4\d{12}(?:\d{3})?$", num):
            print("VISA")

        else:
            print("INVALID")

    else:
        print("INVALID")


def verify_digits(num):

    sum = sumodd(num, 0) + sumeven(math.floor(num/10), 0)
    return sum % 10 == 0

def sumodd(n, sum):
    if n > 0:
        return sumodd(math.floor(n/100), sum + n % 10)
    else:
        return sum

def sumeven(n, sum):
    if n > 0:
        helper = (n % 10) * 2
        if helper >= 10:
            helper = helper % 10 + 1
        return sumeven(math.floor(n/100), sum + helper)
    else:
        return sum


if __name__ == "__main__":
    main()
