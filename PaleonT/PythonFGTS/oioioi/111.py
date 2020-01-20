from random import choice, randint

x, y = int(input()), int(input())
z = []
for x in range(0,x):
    oi = []
    for e in range(0,y):
        oi.append(randint(0,100))
    z.append(oi)

for i in z:
    print(i)
mini=[]
inde = []
for o in z:
    mini.append(min(o))
    inde.append(o.index(min(o)))
    
print(mini, inde)

for i in range(0,x):
    z[]
