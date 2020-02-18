a = input("Text: ")

x = 0

pocet=1
for i in range(0,len(a)):
    
    if a[i] != " ":
        x= i
        break

    
for i in range(x,len(a)):
    if a[i] == " " and a[i+1]!=" ":
        pocet += 1
    
 
       
    




print(pocet)