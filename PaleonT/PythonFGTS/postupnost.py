from random import *

x = []

for i in range(0,3):
    x.append(randint(0,66))


def rast(tabfel):
    x = 0
    x1 =x+1
    rig = True
    while x<len(tabfel):
        if x <= x1:
            continue
        else:
            rig = False

    return rig

print (x)
print (rast(x))