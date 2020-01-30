import random

def check(numero,index,indexC,grid):
    IsAlone = True
    counter = 0

    if numero in indexC:
        counter += 1
    
    for i in range (1,9):
        if grid[i][index] == numero:
            counter+=1
        else :
            continue
    
    if counter>0:
        IsAlone = False

    return IsAlone


grid = [[],[],[],[],[],[],[],[],[],]
for o in range(0,9):  
    
    while True :
        r = random.randint(1,9)
        if check(r,len(grid[o]),grid[o],grid):
            grid[o].append(r)
        if len(grid[o]) == 9:
            break


for i in grid:
    print(i)



