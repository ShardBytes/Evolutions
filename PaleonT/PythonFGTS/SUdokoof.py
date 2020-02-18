import random



gridV = [[],[],[],[],[],[],[],[],[]]
gridH = [[],[],[],[],[],[],[],[],[]]
pp = 0
for o in range(0,9):  
    
    while True :
        r = random.randint(1,9)
        if r not in gridH[o] and r not in gridV[pp]:
            gridH[o].append(r)
            gridV[pp].append(r)
            pp+=1
        if len(gridH[o]) == 9:
            pp = 0
            break


for i in gridH:
    print(i)

