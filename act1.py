x=0
listprice=[]
while x<6:
    price=(float(input("Price: ")))
    x+=1
    listprice.append(price)
x=0
while x<6:
    Eprice = listprice[x] * 0.87
    print(f"Euro Price: {Eprice:.2f}")
    x+=1

    