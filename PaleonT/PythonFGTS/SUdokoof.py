import random

grid = [[],[],[],[],[],[],[],[],[],]

while True :
    r = random.randint(1,9)
    if r not in grid[0]:
        grid[0].append(r)
    if len(grid[0]) == 9:
        break

print(grid[0])

def check(nemero,index):
    IsAlone = True
    counter = 0
    for i in range(0,8):
        if grid[i][index] == nemero:
            couter+=1
        if nemero in grid[i]:
            counter+=1
        else:
            continue
    if counter>0:
        IsAlone = False

    return IsAlone

while True :
    r = random.randint(1,9)
    for i in range(8):
        if check(r,i):
            grid[0].append(r)
        if len(grid[0]) == 9:
            break