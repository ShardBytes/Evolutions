pocet_riadkov = int(input("Pocet riadkov"))
pocet_hviezdiciek = int(input("Pocet hviezdiciek"))

for i in range(1,pocet_riadkov+1):
    print(i, end="  ")
    print("*"*pocet_hviezdiciek)