import random
import sys

def main():
    while True:
        try:
            level = int(input("Level: "))

            if isinstance(level, int):
                if level > 0:
                    break

        except ValueError:
            pass

    ans = random.randint(1, level)

    while True:
        try:
            guess = int(input("Guess: "))

            if isinstance(guess, int):
                if guess > 0:
                    if guess < ans:
                        print("Too small! ")

                    elif guess > ans:
                        print("Too large! ")

                    else:
                        sys.exit("Just right! ")

        except ValueError:
            pass

main()

