n = 10   #int(input("n = "))+1
x = 100
it = 0

for i in (range(1,n+2)):
    for a in range(0,x+10,10):
        print(a+it,end=(", "))
    it = it+1
    print()    

    
    
