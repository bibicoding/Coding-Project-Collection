import sys
import csv


def main():
    if len(sys.argv) == 3:
        filetype1 = sys.argv[1].split(".")
        filetype2 = sys.argv[2].split(".")
        if filetype1[1] == "csv" and filetype2[1] == "csv":
            try:
                redo(sys.argv[1], sys.argv[2])

            except FileNotFoundError:
                sys.exit(f"Could not read {sys.argv[1]}")

        else:
            sys.exit("Not a CSV file")

    elif len(sys.argv) < 3:
        sys.exit("Too few command-line arguments")

    else:
        sys.exit("Too many command-line arguments")


def redo(file1, file2):
    with open(file2, "w") as f2:
        fieldnames = ["first", "last", "house"]
        writer = csv.DictWriter(f2, fieldnames = fieldnames)

        writer.writeheader()

        with open(file1) as f1:
            reader = csv.DictReader(f1)
            for row in reader:
                last, first = row["name"].split(", ")
                house = row["house"]
                writer.writerow({"first": first, "last": last, "house": house})



if __name__ == "__main__":
    main()
