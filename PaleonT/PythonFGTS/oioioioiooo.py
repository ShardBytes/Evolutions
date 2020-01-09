import random
oioioi = []

for i in range(1,21):
    oioioi.append(i*5)

print(oioioi)

zad = random.randint(0,100)

for i in oioioi:
    if zad <= i:
        oioioi.insert(oioioi.index(i),zad)
        break

print(oioioi)