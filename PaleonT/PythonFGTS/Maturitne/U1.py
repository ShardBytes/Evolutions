import random

c1 = random.randint(0,1000)
c2 = random.randint(0,1000)

print (c1)
print (c2)

sucet = 0
podiel = 0
modulo = 0

for i in range(c1):
    sucet += c2

print (f"sučet je {sucet}")

if c1> c2 :
    while c1 > c2:
        c1 -= c2
        podiel +=1
else:
    while c2 > c1:
        c2 -= c1
        podiel +=1

print (f"podiel je {podiel}")

if c1> c2 :
    while c1 > c2:
        c1 -= c2
    print (f"zvysok je {c1}")
else:
    while c2 > c1:
        c2 -= c1
    print (f"svysok je {c2}")
        