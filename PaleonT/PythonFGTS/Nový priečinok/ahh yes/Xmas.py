n = int(input("n = "))
ahh = 2


for x in range(0, n+1):
    if x == 0:
        print("  ",end="")
    elif x<10:
        print(f"||{x} ",end="")
    else:
        print(f"||{x}",end="")
print()
print("____"*(n+1),end="")
print()
print("____"*(n+1),end="")
print()
for i in range(1,n+1):
    if i<10:
        print(i,end=" |")
    else:
        print(i,end="|")
        
    for x in range(1, n+1):
        
        if i*x <10:
            print(f"|  {i*x}",end="")
            
        elif i*x <100:
            print(f"| {i*x}", end="")
            
        else:
            print(f"|{i*x}" , end="")
    print()
    print("____"*(n+1),end="")
    print()
    