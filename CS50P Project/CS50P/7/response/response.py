from validator_collection import checkers

def main():
    print(verify(input("What's your email address? ").strip().lower()))

def verify(email):
    is_email_address = checkers.is_email(email)
    if is_email_address:
        return "Valid"
    else:
        return "Invalid"

if __name__ == "__main__":
    main()
