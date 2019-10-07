from math import sqrt
import time

n = int(input("Zadaj cele čislo "))
then = time.time()
for zistene in range(2,n+1):

    početDelitelov = 0   
    odmocninaZn = round(sqrt(zistene))

    for i in range (1,odmocninaZn+1):
        if zistene % i == 0:
            početDelitelov += 1
    
    if početDelitelov>1:
        n+=0  
    else:
        hlava = (2**(zistene-1))*((2**zistene)-1)
        control = hlava
        sucet = 0
        for i in range(1,hlava+1): 
            if hlava % i == 0:
                sucet = sucet + i
        if control == sucet - control:
            print(hlava,end=" ")    
noe = time.time()

print(noe-then)