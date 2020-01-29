import random

grid = [[],[],[],[],[],[],[],[],[],]

while True :
    r = random.randint(1,9)
    if r not in grid[0]:
        grid[0].append(r)
    if len(grid[0]) == 9:
        break

print(grid[0])