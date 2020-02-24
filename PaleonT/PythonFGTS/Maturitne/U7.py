#Napíšte program, ktorý vymení v postupnosti náhodne vygenerovaných reálnych čísel najmenšie a najväčšie číslo.



from random import * 
postupnost = []


for i in range(20):
    postupnost.append(randint(-7000,7000))
print(postupnost)
maxi = 0
mini = 0

for i in postupnost:
    if i >maxi:
        maxi = i
        
    if i <mini:
        mini =i

maxiIndex = postupnost.index(maxi)
miniIndex = postupnost.index(mini)

postupnost[miniIndex], postupnost[maxiIndex] = maxi, mini

