import sys
from PIL import Image, ImageOps

def main():
    if len(sys.argv) == 3:
        filename1 = sys.argv[1].lower().split(".")
        filename2 = sys.argv[2].lower().split(".")

        if filename2[1] == "png" or "jpg" or "jpeg":
            if filename1[1] == filename2[1]:
                try:
                    photoshop(sys.argv[1], sys.argv[2])

                except FileNotFoundError:
                    sys.exit("Input does not exist")

            else:
                sys.exit("Input and output have different extensions")

        else:
            sys.exit("Invalid output")

    elif len(sys.argv) < 3:
        sys.exit("Too few command-line arguments")

    else:
        sys.exit("Too many command-line arguments")



def photoshop(file1, file2):
    shirt = Image.open("shirt.png")
    person = Image.open(file1)
    person = ImageOps.fit(person, shirt.size)
    person.paste(shirt, box = (0, 0), mask = shirt)
    person.save(file2)

if __name__ == "__main__":
    main()

