#Napíšte program, ktorý vypíše na obrazovku tabuľku malej násobilky od 1 po číslo, ktoré zadá užívateľ.

velkost = int(input("zadaj čislo: ")) +1


print(" ",end=" ")
for i in range(1,velkost):
    print(i, end=" ")
print()

for o in range(1,velkost):
    print(o,end=" ")
    for i in range(1,velkost):
        print(i*o, end=" ")
    print()
