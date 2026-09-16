while True:
    print("Get the average of three subjects and grade the student")
    print("Input:")

    Java_Score=int(input("Java Score:"))
    C_Score=int(input("C Score:"))
    Database_Score=int(input("Database Handling Score:"))

    AvgScore = float(Java_Score + C_Score + Database_Score) // 3

    if AvgScore <= 100 and AvgScore >=90:
        print(f"The average of the student is {AvgScore}, so the student's grade is A.")
    elif AvgScore <=89 and AvgScore >=80:
        print(f"The average of the student is {AvgScore}, so the student's grade is B.")
    elif AvgScore <=79 and AvgScore >=75:
        print(f"The average of the student is {AvgScore}, so the student's grade is C.")
    elif AvgScore <=74:
        print(f"The average of the student is {AvgScore}, so the student's grade is F.")

    choice = input("\nDo you want to compute another student's average? (YES/NO): ").strip().upper()

    if choice != "YES":
            print("Program terminated.")
            break