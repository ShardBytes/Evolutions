vstup = input("Zadaj datum narodenia oddeleny bodkami: ")
pohlavie = input("zadaj svoje pohlavie vo forme písmen m - muž z - žena: ")

x = vstup.split(".")

x[2] = x[2][2:]

def nasl(cislo):
    oof = 0
    koof = 0
    nas = 0
    for i in range(0,len(cislo),2):
        oof = int(i)+ oof
    for i in range(1,len(cislo),2):
        koof = int(i)+ koof
    nas = (koof-oof)%11
    return nas



rodne = ""
if pohlavie == "m":
    for i in reversed(x):
        rodne =rodne +i
    nase = nasl(rodne)
    rodne = rodne+"/"+str(nase)
    print(rodne)
else:
    x[1]= str(int(x[1])+50)
    for i in reversed(x):
        rodne =rodne +i
    rodne =rodne +i
    nase = nasl(rodne)
    rodne = rodne+"/"+str(nase)
    print(rodne)

