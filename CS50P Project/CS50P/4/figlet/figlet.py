import sys
import random
from pyfiglet import Figlet

figlet = Figlet()

def main():
    fonts = figlet.getFonts()
    f = sys.argv[-1]

    if f in fonts and sys.argv[1] == "-f":
        string = input("Input: ")
        figlet.setFont(font = f)


    elif len(sys.argv) == 1:
        string = input("Input: ")
        figlet.setFont(font = random.choice(fonts))

    else:
        sys.exit("Invalid usage")

    fig = figlet.renderText(string)
    print("Output:", fig)


main()
