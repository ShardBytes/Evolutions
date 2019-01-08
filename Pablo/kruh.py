import math

polomer = int(input("Zadaj polomer: "))

#print(math.pi)

obvod = 2*math.pi*polomer
obsah = math.pi*polomer**2

print("Obsah je {} cm2 a obvod je {} cm".format(obsah, obvod))
