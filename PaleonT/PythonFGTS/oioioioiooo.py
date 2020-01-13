#zoznam retazcov nahodnej dlzky
#funkcia parametre. zoznam  vystup -> novy zoznamdlzky stringov vygenerovaneho zoznamu
from random import *
import string



x = []
oi =""
for i in range(0,10):
    for o in range (0,randint(0,20)):
        oi = oi + choice(string.ascii_lowercase)
    x.append(oi)
    oi = ""

print(x)

def dlzky(tabfel):
    dlzky = []
    for p in tabfel:
        dlzky.append(len(p))
    return dlzky

oioioi = dlzky(x)