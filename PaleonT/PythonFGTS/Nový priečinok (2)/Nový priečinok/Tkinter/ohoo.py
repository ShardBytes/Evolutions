"""hn = int(input("Číslo: "))

delitel = 2

while hn > 1:
    if hn % delitel == 0:
        hn = hn // delitel
        
        if hn <= 1:
            print(delitel)
        else:
            print(f"{delitel} *",end=(" "))
    else:
        delitel = delitel + 1

"""

#Pyta vek použivatelov kím pouzivatel nezada 0 a vypíše priemerný vek

pocet = 0
vek = int(input("nigga"))
sucet = vek
while vek > 0:
    sucet = sucet + vek
    pocet += 1
    vek = int(input("nigga"))