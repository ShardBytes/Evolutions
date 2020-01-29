s1 = open("KysNAnanas.txt", "r")

oi = s1.read().split(" ")

for i in oi:
    
    if i == "." or "," or "!" or "?":
        print("")
    else:
        print(i)
