#Napíšte program, ktorý načíta od užívateľa koeficienty kvadratickej rovnice, napíše kvadratickú rovnicu na obrazovku a tiež do textového súboru D:\maturita\kvadrat.txt, určí jej korene v R a zapíše ich tiež do uvedeného súboru. 
from math import sqrt
x = open("kvadrat.txt","w")

a ,b, c = input("zadaj koeficient a: "), input("zadaj koeficient b: "), input("zadaj koeficient c: ")

if int(b) >= 0:
    b = (f"+{b}")

if int(c) >= 0:
    c = (f"+{c}")

print(f"{a}x^2{b}x{c}")
x.write(f"{a}x^2{b}x{c} \n")

a,b,c =int(a), int(b), int(c)

D = (b*b)-(4*a*c)
if D < 0:
    x.write("nema vysledok")
    SystemExit()
else:

    v1, v2 = str(round((-b+sqrt(D) / 2)))  , str(round((-b-sqrt(D) / 2)))

    x.write(f"x1={v1}  x2={v2}")

