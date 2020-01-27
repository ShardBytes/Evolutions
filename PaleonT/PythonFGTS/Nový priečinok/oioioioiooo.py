#zoznam retazcov nahodnej dlzky
#funkcia parametre. zoznam  vystup -> novy zoznamdlzky stringov vygenerovaneho zoznamu
from random import *
import string

def najd(dlzka):
    eee = dlzka[0]
    inde = 0
    for i in dlzka:
        if i > eee:
            eee = i
            inde = dlzka.index(i)
    return x[inde]

def dlzky(tabfel):
    dlzky = []
    for p in tabfel:
        dlzky.append(len(p))
    return dlzky


x = []
oi =""
for i in range(0,10):
    for o in range (0,randint(0,20)):
        oi = oi + choice(string.ascii_lowercase)
    x.append(oi)
    oi = ""

print(x)

oioioi = dlzky(x)

print(najd(oioioi))