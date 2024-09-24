import sys
import csv
from tabulate import tabulate

def main():
    if len(sys.argv) == 2:
        filetype = sys.argv[1].split(".")
        if filetype[1] == "csv":
            try:
                table = read(sys.argv[1])
                print(tabulate(table, headers = "firstrow", tablefmt = "grid"))

            except FileNotFoundError:
                sys.exit("File does not exist")

        else:
            sys.exit("Not a CSV file")

    else:
        if len(sys.argv) < 2:
            sys.exit("Too few command-line arguments")
        else:
            sys.exit("Too many command-line arguments")

def read(filename):
    s = []
    with open(filename) as file:
        reader = csv.reader(file)
        for row in reader:
            s.append(row)

    return s


if __name__ == "__main__":
    main()
