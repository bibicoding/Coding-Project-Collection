def translate():
    file = input("Extensions: ").lower()

    if ".gif" in file or ".jpg" in file or ".jpeg" in file or ".png" in file:
        #print("T1")

        if ".gif" in file:
            print("image/gif")
        elif ".jpg" in file or ".jpeg" in file:
            print("image/jpeg")
        elif ".png" in file:
            print("image/png")

    elif ".pdf" in file or ".txt" in file or ".zip" in file:
        #print("T2")

        if ".pdf" in file:
            print("application/pdf")
        if ".txt" in file:
            print("text/plain")
        if ".zip" in file:
            print("application/zip")

    else:
        #print("T3")
        print("application/octet-stream")

translate()
