import random


def main():
    level = get_level()
    n = 1
    correct = 0
    wrong_streak = 1

    while n <= 10:
        try:
            x, y = generate_integer(level)
            sum = x + y

            while True:
                ans = int(input(f"{x} + {y} = "))

                if ans == sum:
                    correct += 1
                    n += 1
                    break

                elif wrong_streak < 3:
                    print("EEE")
                    wrong_streak += 1

                else:
                    raise ValueError

        except ValueError:
                if wrong_streak < 3:
                        print("EEE")
                        wrong_streak += 1

                else:
                    print(f"{x} + {y} = {sum}")
                    n += 1
                    wrong_streak = 0

    print("Score:", correct)




def get_level():
    while True:
        try:
            l = int(input("Level: "))
            if l in [1, 2, 3]:
                return int(l)

        except ValueError:
             pass


def generate_integer(level):
    if level == 1:
        min = 0
    else:
        min = 10 ** (level - 1)

    max = 10 ** level - 1
    x = random.randint(min, max)
    y = random.randint(min, max)
    return x, y

if __name__ == "__main__":
    main()
