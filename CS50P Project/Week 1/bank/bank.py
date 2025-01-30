def greeting():
    gre = input("Greeting: ").strip().replace(" ", "").title()

    if "Hello" in gre:
        print("$0")
    elif "H" in gre:
        print("$20")
    else:
        print("$100")

greeting()


