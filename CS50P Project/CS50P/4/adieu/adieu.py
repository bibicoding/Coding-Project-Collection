import inflect
p = inflect.engine()

def main():
    names = []

    while True:
        try:
            name = input("Name: ").title()
            names.append(name)

        except EOFError:
            names = p.join(names)
            print(f"Adieu, adieu, to {names}")
            break

main()


