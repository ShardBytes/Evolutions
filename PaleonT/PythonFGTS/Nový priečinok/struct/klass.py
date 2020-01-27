#win1250 > 256 znakov
#utf-8 > 
#Unicode > 65536 znakov Všetky znaky abeced
from string import ascii_letters
import random
def randHeslo(dlzka):
    i = 0
    heslo = ""
    while i < dlzka:
        heslo = heslo + random.choice(ascii_letters)
        i += 1

    return heslo

print(randHeslo(9))

print(ord("č"))