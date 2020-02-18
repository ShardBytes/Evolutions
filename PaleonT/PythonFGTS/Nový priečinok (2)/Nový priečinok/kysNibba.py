import random

x = [random.randint(0,1000)]

for i in range(1,20):
    x.append(random.randint(0,1000))
    
print(x)
mini = x[0]
xi = 0

for i in x:
    if i>mini:
        mini = i
        xi = x.index(i)
    else:
        continue

x[xi] = 0
mini = x[0]
print(xi)

for i in x:
    if i>mini:
        mini = i
        xi = x.index(i)
    else:
        continue
        

print (mini)