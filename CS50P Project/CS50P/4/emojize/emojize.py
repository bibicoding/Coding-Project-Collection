import emoji
def main():
    a = input("Input: ")
    print(f"Output: {emoji.emojize(a, language = "alias")}")

main()
