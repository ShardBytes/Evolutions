
from random import randint
cislo = (randint(0, 100))


print("Vitaj v programe Asker")
tip = input("Zadaj svoje číslo: ")


ctip = int(tip)

while(ctip!=cislo):

    if ctip < cislo:
        ctip = int(input("Zadaj väčšie číslo: "))
    else:
        ctip = int(input("Zadaj menšie číslo: "))


if ctip == cislo:
    print("Uhadol si číslo!")


#if
#else
#else if = elif

#else
 #statement(s)
