vstup = input("Zadaj datum narodenia oddeleny bodkami: ")
pohlavie = input("zadaj svoje pohlavie vo forme písmen m - muž z - žena: ")

x = vstup.split(".")

x[2] = x[2][2:]





rodne = ""
if pohlavie == "m":
    for i in reversed(x):
        rodne =rodne +i
    
    print(rodne)
else:
    x[1]= str(int(x[1])+50)
    for i in reversed(x):
        rodne =rodne +i
    
    
    print(rodne)

