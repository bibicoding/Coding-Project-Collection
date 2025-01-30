def main():
    o = input("Input: ")
    output = shorten(o)
    print("Output:", output)


def shorten(word):
    for i in word:
        if i in ["A", "E", "I", "O", "U", "a", "e", "i", "o", "u"]:
            word = word.replace(i, "")
    return word


if __name__ == "__main__":
    main()
