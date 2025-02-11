def main():
    while True:
        try:
            fraction = input("Fraction: ")
            scale = convert(fraction)
            gas = gauge(scale)
            print(gas)
            break

        except (ValueError, ZeroDivisionError):
            pass


def convert(fraction):

    x, y = fraction.split("/")
    x = int(x)
    y = int(y)

    percent = x / y

    if 1 >= percent >= 0:
        return round(percent * 100)
    else:
        main()


def gauge(percentage):

    if 1 < percentage < 99:
        return f"{percentage}%"
    elif 0 <= percentage <= 1:
        return "E"
    elif 99 <= percentage <= 100:
        return "F"


if __name__ == "__main__":
    main()
