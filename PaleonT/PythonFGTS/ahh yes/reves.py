n = int(input("n = "))
zzz = n

for i in range(0,n):
    print(" "*zzz, end=(""))
    
    for x in range(1,i+2):
        print("* ", end=(""))
    zzz = zzz-1
    print()