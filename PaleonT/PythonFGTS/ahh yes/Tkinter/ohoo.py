hn = int(input("Číslo: "))

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

