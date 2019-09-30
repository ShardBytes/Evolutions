from math import sqrt

print("zadaj koeficienty")
a = float(input("zadaj a = "))
b = float(input("zadaj a = "))
c = float(input("zadaj a = "))

D = (b**2) - (4*a*c)

x1 = 0
x2 = 0
if D <0:
    print("Nemá riesenie")
else:
    x1 = (-b + sqrt(D))/2*a
    x2 = (-b - sqrt(D))/2*a
    print(f"Korene rovnice sú {x1} a {x2}")