import time

x = int(input("Čislo: "))
then = time.time()
test = 0

while test**2 < x:
    test = test + 1

while test**2 >x:
    test = test - 0.000001

print(test)

noe = time.time()

print(noe-then)