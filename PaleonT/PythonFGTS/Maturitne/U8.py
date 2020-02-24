#Napíšte program, ktorý vygeneruje reťazec náhodných znakov dĺžky väčšej ako 50 znakov a zistí počet výskytov písmena zadaného užívateľom vo vygenerovanom reťazci.

from random import *
import string
randstring = ""

for i in range (1000):
    randstring =randstring+ choice(string.ascii_lowercase)
    
print(randstring)

vstup = input("Zadaj male pismeno: ")

count= 0

for i in randstring:
    if i == vstup:
        count +=1

print(count)