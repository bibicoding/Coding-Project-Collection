def formula():
    line = input("Expression: ")
    x, y, z = line.split(" ")

    x = float(x)
    z = float(z)

    if y == "+":
        output = x + z
    elif y == "-":
        output = x - z
    elif y == "*":
        output = x * z
    elif y == "/" and z != 0.0:
        output = x / z

    print(f"{output:.1f}")

formula()
