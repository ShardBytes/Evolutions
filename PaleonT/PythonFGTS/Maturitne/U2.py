s1 = open("vzor.txt","r")

s1 = s1.read().replace(",","").replace(".","")

s1 = s1.split("\n")

dex = 0
dlyka = 0
slovo = ""

for o in s1:
    o = o.split(" ")
    for i in o:
        if len(i)>dlyka:
            dlyka = len(i)
            slovo = i
            

print(dex,dlyka,slovo)

