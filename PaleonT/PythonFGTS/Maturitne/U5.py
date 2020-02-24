#Napíšte program, ktorý zistí pomocou funkcie, v ktorom týždni počas roka mal Janko najvyššie výdavky na sladkosti. Jankove výdavky vygeneruje program ako desatinné čísla v rozsahu (0€-2,55€) s presnosťou na dve desatinné miesta.

from random import * 

vydavky = []

for i in range(365):
    vydavky.append(randint(0,255)/100)

def najvatsi (rokVydavky):
    den = 0
    a = rokVydavky[0]
    for i in rokVydavky:
        if i > a:
            den = rokVydavky.index(i)
    
    return den


print(najvatsi(vydavky))