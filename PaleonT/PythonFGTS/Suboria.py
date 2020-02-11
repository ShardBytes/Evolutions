s1 = open("ziaci.txt", "r")

najstarsi = 0
najstarsimeno = 0
while True:
    o = s1.readline().split()
    print(o)
    o[0]= int(o[0])
    if o[0]>= 18:
        print(o[1])
    if o[0]>najstarsi:
        najstarsimeno = o
    if len(o) == 1:
        break
print(najstarsimeno)
s1.close()

