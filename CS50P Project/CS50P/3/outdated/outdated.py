months = [
    "January",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December"
]

def main():
    while True:

        date = input("Date: ").strip()

        try:                                        #format: mm/dd/yyyy
            m, d, y = date.split("/")
            m = int(m)
            d = int(d)
            if 0 < m <= 12 and 0 < d <= 31:
                print(f"{y}-{m:02}-{d:02}")
                break
            else:
                pass

        except ValueError:                          #format: month dd, yyyy
            try:
                if "," in date:
                    date = date.replace(",", "")
                    m, d, y = date.split(" ")
                    m = m.title()
                    d = int(d)
                    if m in months and 0 < d <= 31:
                        print(f"{y}-{months.index(m) + 1 :02}-{d:02}")
                        break
                    else:
                        pass
                else:
                    pass

            except ValueError:
                pass




main()
