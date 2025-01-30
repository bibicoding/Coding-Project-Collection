def main():
    camel = input("camelCase: ")
    snake = c2s(camel)
    print(snake)

def c2s(string):
    snake = string[0].lower()
    for i in string[1:]:
        if i.isupper():
            snake += "_" + i.lower()
        else:
            snake += i
    return snake

main()
