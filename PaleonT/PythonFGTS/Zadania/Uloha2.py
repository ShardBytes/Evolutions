n = input("pismeno: ").lower()
oi = ord(n)
print(oi)

for i in range (1,oi-96):
    print (chr(96+i)*i) 