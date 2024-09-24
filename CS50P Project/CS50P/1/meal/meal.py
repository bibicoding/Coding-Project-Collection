def main():
    time = input("What time is it? ")
    time1 = convert(time)

    if 7.0 <= time1 <= 8.0:
        print("breakfast time")
    elif 12.0 <= time1 <= 13.0:
        print("lunch time")
    elif 18.0 <= time1 <= 19.0:
        print("dinner time")

def convert(time):
    hour, minutes = time.split(":")
    x = int(hour)
    y = int(minutes)
    z = x + y/60
    return z

if __name__ == "__main__":
    main()
