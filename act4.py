item1=float(input("item one cost: "))
item2=float(input("item two cost: "))
total= item1 + item2
Payment=float(input("Enter payment: "))


if Payment < total:
    debt = total - Payment
    print(f"Your payment is insufficient. you still owe us {debt:.2f} amount")
elif Payment > total:
    change = Payment - total
    print(f"Thank you for your purchase and your change is {change:.2f}")
else:
    print("Thank you for your purchases")