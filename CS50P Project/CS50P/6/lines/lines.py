import sys

def main():
    if len(sys.argv) == 2:
        filetype = sys.argv[1].split(".")
        if filetype[1] == "py":
            try:
                lines = count_line(sys.argv[1])
                print(lines)

            except FileNotFoundError:
                sys.exit("File does not exist")

        else:
            sys.exit("Not a Python file")

    else:
        if len(sys.argv) < 2:
            sys.exit("Too few command-line arguments")
        else:
            sys.exit("Too many command-line arguments")


def count_line(filename):
    with open(filename) as file:
        blank = 0

        for line in file:
            line = line.strip()
            if not (line.lstrip().startswith("#") or line.strip() == ""):
                blank += 1

        return blank

if __name__ == "__main__":
    main()

