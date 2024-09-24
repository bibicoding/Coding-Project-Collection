import sys


# main function collecting information
def main():
    print("What do you want to do today?")

    mode = input("(1) Encipher | (2) Decipher ")

    if mode == "1" or mode == "(1)":
        string = input(
            "Please provide the information you would like to encipher. "
        ).upper()

        while True:
            try:
                moves = int(input("How many moves do you want to move? "))

                if moves >= 1:
                    new_string = encipher(string, moves)
                    sys.exit(f"Your enciphered code is {new_string}")

                else:
                    print("The number of moves should be no less than 1.")

            except ValueError:
                print("Please enter an integer.")

    elif mode == "2" or mode == "(2)":
        string = input(
            "Please provide the information you would like to decipher. "
        ).upper()
        new_string = decipher(string)
        sys.exit(f"Your deciphered code is {new_string}")

    else:
        sys.exit("User did not provide a valid mode. ")


# pushes each alphabet backwards by given moves
def encipher(str, shift):
    return shifter(str, shift)


# pulls each alphabet foward twice
def decipher(str):
    return shifter(str, -2)


# moves individual characters in the given string
def shifter(char, n):
    return "".join(chr((ord(i) - 65 + n) % 26 + 65) if i.isalpha() else i for i in char)


if __name__ == "__main__":
    main()
