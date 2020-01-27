from random import choice, randint
z=[[1,2,3,1,2,3],[4,5,6,4,5,6],[6,8,12,6,8,12]]


"""
x, y = int(input()), int(input())
z = []
for x in range(0,x):
    oi = []
    for e in range(0,y):
        oi.append(randint(0,9))
    z.append(2*oi)

for i in z :
    print(i)

"""

def computD(tabfel):
    D = 0
    sumaplus = 0
    sumaminus = 0
    for i in range (0,2):
        sumaplus =sumaplus + (z[0][i]*z[1][i+1]*z[2][i+2])
    for i in reversed(range (3,5)):
        sumaminus = sumaminus + (z[0][i]*z[1][i-1]*z[2][i-2])

    D = sumaminus-sumaplus
    return D

print(computD(z))