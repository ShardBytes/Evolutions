"""sucet parnych cisel po zadane cislo"""
a = 0
n = int(input("n = "))+1

for i in range(n):
    if i%2 == 1:
       continue 
    a = a + i
    
print(f"sucet parnych cisel po  {n-1} je {a}")