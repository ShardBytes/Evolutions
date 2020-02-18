import random
"""
m = input("Zadaj vetu: ")
out = ""

for i in m:
    x = chr(random.randint(97,122))
    out =out+i+x

print(out)
startM = ""
for i in range(0,len(out),2):
    startM = startM+out[i]
print(startM)    
"""

q = input(": ")

def cezSif(puta):
    out = ""
    for i in range(0,len(puta)):
        out = out + chr(ord(puta[i])+1)
    return out
print(cezSif(q))