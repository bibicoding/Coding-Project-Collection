x = input("What time is it? ")

y = float(x.replace(":","."))

z = y + y

if 12 <= z <= 13:
    print(z)
