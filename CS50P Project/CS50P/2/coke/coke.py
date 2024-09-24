def main():
    due = 50
    due = inserting(due)
    print("Change Owed:", abs(due))



def inserting(d):
    while d > 0:
        print("Amount Due:", d)
        insert = int(input("Insert Coin: "))
        if insert in [25, 10, 5]:
            d -= insert
    return d

main()
