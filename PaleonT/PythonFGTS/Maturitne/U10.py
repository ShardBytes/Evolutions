#Chystáte sa na výlet. Poznáte nosnosť batoha a postupne doň ukladáte veci, ktorých hmotnosť tiež poznáte. Zistite, koľko vecí sa vám zmestí do batoha. Napíšte program, ktorý od používateľa načíta hmotnosť batoha, a hmotnosť jednotlivých vecí. Posledná zadaná hmotnosť je 0. Program skončí po načítaní všetkých hodnôt alebo ak je už prekročená nosnosť batoha. Nakoniec vypíše, koľko vecí si so sebou beriete.

nosnost = int(input("Zadaj nosnost: "))
ruksak = []




while True:
    i = int(input("zadaj hmotnost predmetu: "))
    if i == 0:
        print (len(ruksak))
        break
    
    ruksak.append(i)
    sucet = 0
    for i in ruksak:
        sucet +=i

    if sucet > nosnost:
        print (len(ruksak)-1)
        break
    
        

    
        
    SystemExit()
    


