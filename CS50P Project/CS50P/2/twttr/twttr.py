def main():
    original = input("Input: ")
    output = omit(original)
    print("Output:", output)

def omit(string):
    for i in string:
        if i in ["A", "E", "I", "O", "U", "a", "e", "i", "o", "u"]:
            string = string.replace(i, "")
    return string

main()
