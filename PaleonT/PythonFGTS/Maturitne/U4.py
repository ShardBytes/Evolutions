"""Napíšte program, ktorý vygeneruje a vypíše postupnosť 50 celých čísel z intervalu 
<-7000, 7000>, potom vypíše všetky záporné čísla z postupnosti na obrazovku a do textového súboru d:\maturita\zaporne.txt."""

from random import *

a = open("zaporne.txt", "w")

for i in range(50):
    ran = randint(-7000,7000)
    if ran < 0:
        a.write(str(ran) + " ")

a.close()

