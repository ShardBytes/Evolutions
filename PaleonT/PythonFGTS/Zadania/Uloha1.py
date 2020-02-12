N = int(input("Zadaj čislo N: "))
count= 0
rocne = 0
for i in range (1,36):
    print(N,end=", ")
    rocne += N
    if i % 5 == 0:
        print()

    if i % 12 == 0:
        print ()
        print (rocne)