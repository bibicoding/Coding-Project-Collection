import re

def main():
    print(parse(input("HTML: ").strip()))


def parse(s):
    if pattern := re.search(r'^(?:.+)?"https?://(?:www\.)?youtube\.com/embed/(\w+)"(?:.+)?$', s):
        return f"https://youtu.be/{pattern.group(1)}"


if __name__ == "__main__":
    main()

