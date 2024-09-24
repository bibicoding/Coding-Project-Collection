def main():
    dollars = dollars_to_float(input("How much was the meal? "))
    percent = percent_to_float(input("What percentage would you like to tip? "))
    tip = dollars * percent
    print(f"Leave ${tip:.2f}")

# remove hash and return float value
def dollars_to_float(d):
    d = d.strip("$")
    return float(d)


# remove % and return float (decimal) value
def percent_to_float(p):
    p = p.strip("%")
    p = float(p) * 0.01
    return float(p)

main()
