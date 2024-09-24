def main():
    plate = input("Plate: ")
    if is_valid(plate):
        print("Valid")
    else:
        print("Invalid")


def is_valid(s):
    char_al = 0
    char_n = 0
    for i in s:
        if i.isalpha() and char_n == 0:
                char_al += 1
        elif i.isdigit() and char_al >= 2:
            if char_n == 0 and i == "0":
                return False
            else:
                char_n += 1
        else:
            return False

    if 2 <= char_al + char_n <= 6:
        return True
    else:
        return False


if __name__ == "__main__":
    main()
