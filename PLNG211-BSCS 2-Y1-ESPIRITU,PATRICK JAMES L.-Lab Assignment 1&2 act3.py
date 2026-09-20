while True:
    print("give a multiple of 5 between 1 and 100")
    number = int(input())

    result = number % 5
    if result == 0:
        print("Valid")
    if result!= 0:
        print("Invalid.")
        break
