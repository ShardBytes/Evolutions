from math import sqrt

n = int(input("Zadaj cele čislo "))

for zistene in range(2,n+1):

    početDelitelov = 0   
    odmocninaZn = round(sqrt(zistene))

    for i in range (1,odmocninaZn+1):
        if zistene % i == 0:
            početDelitelov += 1
    
    if početDelitelov>1:
        print(f"Čislo {zistene} nie je prvočislo")    
    else:
        print(f"Čislo {zistene} je prvočislo")