while True:
    print("ARITHMETIC CALCULATOR")
    print("1.Addition  2.Subtraction   3.Multiplication")
    print("4.Division  5.Modulus      6.Increment")
    print("7.Decrement")


    choice=int(input("select an arithmetic operation:"))
    x =int(input("Enter the value of X:"))
    y =int(input("Enter the value of Y:"))

    addition = x + y
    subtraction = x - y
    multiplication = x * y
    quotient = x / y
    modulus = x % y
    increment = x
    decrement = x

    print(f"Variable values: x = {x:.1f}, y = {y:.1f} ")
    if  choice == 1:
        print(f"Addition: x + y = {addition:.1f}")
    if  choice == 2:
        print(f"Subtraction: x - y = {subtraction:.1f}")
    if  choice == 3:
        print(f"Multiplication: x * y = {multiplication:.1f}")
    if  choice == 4:
        print(f"Division: x / y = {quotient}")
    if  choice == 5:
        print(f"Modulus: x % y = {modulus:.1f}")
    if  choice == 6:
        x += 1
        print(f"Increment: x++ = {x:.1f}")
    if  choice == 7:
        x -= 2
        print(f"Decrement: x-- = {x:.1f}")

    choice2 = input("\nDo you want to compute another student's average? (YES/NO): ").strip().upper()

        
    if choice2 != "YES":
        print("Program terminated.")
        break