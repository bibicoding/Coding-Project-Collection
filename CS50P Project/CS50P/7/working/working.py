import re


def main():
    print(convert(input("Hours: ").strip()))


def convert(s):

    if pattern := re.search(r"^(\d{1,2}(?::\d{2})?) (AM|PM) to (\d{1,2}(?::\d{2})?) (AM|PM)$", s):

        if ":" in pattern.group(1):
            h1, m1 = pattern.group(1).split(":")
            h1 = int(h1)
            m1 = int(m1)

            if 0 <= m1 <= 59:
                m1 = f"{m1:02}"
            else:
                raise ValueError

        else:
            h1 = pattern.group(1)
            h1 = int(h1)
            m1 = "00"

        if ":" in pattern.group(3):
            h2, m2 = pattern.group(3).split(":")
            h2 = int(h2)
            m2 = int(m2)

            if 0 <= m2 <= 59:
                m2 = f"{m2:02}"
            else:
                raise ValueError

        else:
            h2 = pattern.group(3)
            h2 = int(h2)
            m2 = "00"


        if pattern.group(2) == "AM":
            h1 = AM(h1)
        else:
            h1 = PM(h1)

        if pattern.group(4) == "AM":
            h2 = AM(h2)
        else:
            h2 = PM(h2)

        if h1 != "F" and h2 != "F":
            return f"{h1}:{m1} to {h2}:{m2}"
        else:
            raise ValueError

    else:
        raise ValueError



def AM(hour):
    if 1 <= hour <= 11:
        return f"{hour:02}"
    elif hour == 12:
        return "00"
    else:
        return "F"

def PM(hour):
    if 1 <= hour <= 11:
        return f"{hour+12}"
    elif hour == 12:
        return "12"
    else:
        return "F"


if __name__ == "__main__":
    main()
