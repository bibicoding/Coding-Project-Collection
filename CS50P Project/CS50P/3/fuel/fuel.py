def main():
    scale = convert("Fraction: ")
    print(scale)

def convert(prompt):
    while True:
        f = input(prompt)

        try:
            x, y = f.split("/")
            x = int(x)
            y = int(y)
            if 0.01 * y < x < 0.99 * y:
                return f"{(x / y) * 100:.0f}%"
            elif 0 <= x <= 0.01 * y:
                return "E"
            elif 0.99 * y <= x <= y:
                return "F"

        except ValueError:
            pass
        except ZeroDivisionError:
            pass
        except x < 0 or y < 0:
            pass

main()


