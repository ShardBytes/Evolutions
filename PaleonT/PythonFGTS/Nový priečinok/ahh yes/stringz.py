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
elif D == 0:
    x1 = round((-b)/2*a,2)
    print(f"Rovnica ma jedno riesenie {x1}")
else:
    x1 = round((-b + sqrt(D))/2*a,2)
    x2 = round((-b - sqrt(D))/2*a,2)
    print(f"Korene rovnice sú {x1} a {x2}")