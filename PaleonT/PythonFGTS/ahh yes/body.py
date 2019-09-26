maxBody = int(input("Zadaj max počet bodov "))
ziskane = int(input("Zadaj počet získaných bodov "))

if (ziskane/maxBody*100)<30:
    print(f"Získal si {ziskane} bodov z {maxBody}. Tvoja známka je 5")
else:
    print(f"Získal si {ziskane} bodov z {maxBody}. Tvoja známka jelepšia ako 5")