def ask_deep():
    ans = input("What is the Answer to the Great Question of Life, the Universe, and Everything? ")

    ans = ans.lower().strip().replace("-", " ")

    if ans == "42" or ans == "forty two":
        print("Yes")
    else:
        print("No")

ask_deep()
