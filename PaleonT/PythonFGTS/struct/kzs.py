a = {"a","e", "i", "o", "u", "ä", "á", "é", "í", "ó", "ú"}
x = input()

for i in x:
    if i in a:
        print(i)
    else:
        break
