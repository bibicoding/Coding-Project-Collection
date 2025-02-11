from datetime import date
import re
import sys
import inflect

p = inflect.engine()

def main():
    bday = input("Date of Birth: ")
    print(convert(bday))



def convert(birth):
    today = date.today()
    if pattern := re.search(r"^(\d{4})-(\d{2})-(\d{2})$", birth):
        byear = int(pattern.group(1))
        bmonth = int(pattern.group(2))
        bdate = int(pattern. group(3))
        try:
            if birth := date(byear, bmonth, bdate):
                if today >= birth:
                    delta = today - birth
                    minutes = round(delta.total_seconds() / 60)
                    return p.number_to_words(minutes).capitalize().replace(" and", "") + " " + "minutes"

                else:
                    sys.exit("Are you from the future?")

        except ValueError:
            sys.exit("Invalid date")

    else:
        sys.exit("Invalid date")



if __name__ == "__main__":
    main()
