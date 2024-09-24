import re

def main():
    print(validate(input("IPv4 Address: ").strip()))


def validate(ip):
    if re.search(r"^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$", ip):
        try:
            info = ip.split(".")

            for i in info:
                if not 0 <= int(i) <= 255:
                    return False

            return True


        except ValueError:
            return False

    else:
        return False


if __name__ == "__main__":
    main()
