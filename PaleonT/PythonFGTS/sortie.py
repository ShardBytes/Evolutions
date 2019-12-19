import random





oi = [random.randint(0,800)]
for i in range(1,100000):
    oi.append(random.randint(0,800))

def bublosrot(tabel):
    e = True
    vymena = 0
    pocetvymen = 0
    while e:
        for i in range (0,len(tabel)):
            
            



            if i != len(tabel)-1:
                oi1, oi2 = tabel[i], tabel[i+1]
                if oi1 > oi2:
                    vymena += 1
                    tabel[i] = oi2
                    tabel[i+1] = oi1
                    print (tabel)
                
            
            if vymena == 0:
                
                e = False
                
                break
        


bublosrot(oi)




