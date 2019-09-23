
n = int(input("n = "))+2

for i in range(1,n):
    for x in reversed(range(1,i)):
        print(x, end=(", "))
    print(" ")
    
