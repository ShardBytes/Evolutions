import time

x = int(input("Čislo: "))
then = time.time()
test = 0
poci = 0 

while test**2 < x:
    test = test + 1
    poci += 1

while test**2 >x:
    test = test - 0.001
    poci += 1

print(f"odmocnina je {test}")
print(f"pocet porvnani je {poci}")

noe = time.time()

print(noe-then)