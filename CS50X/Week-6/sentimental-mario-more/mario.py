def main():
    while True:
        try:
            height = int(input("Height: "))
            if height >= 1 and height <= 8:
                pyramid(height)
                break
            else:
                print("Height should be an integer between 1 and 8 (inclusive)")

        except ValueError:
            print("Invalid input")

def pyramid(h):
    for i in range(h):
        print(" " * (h-i-1) + "#" * (i+1), end = "")
        print("  ", end = "")
        print("#" * (i+1))


if __name__ == "__main__":
    main()
