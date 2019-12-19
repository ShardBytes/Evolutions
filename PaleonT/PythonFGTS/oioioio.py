import random
import tkinter 

root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 1080, height = 1080)
canvas.pack()

xf = 800

niggapatron = [random.randint(0,xf)]
for i in range (1,10000):
    niggapatron.append(random.randint(0,xf))

pocty = [0]*xf

oi = 0
for i in pocty:
    oi += i
priemer = oi/len(pocty)


for i in range(0,xf):
    for w in niggapatron:
        if i == w:
            pocty[i] +=1



for oof in range(0,xf):
    if pocty[oof]>=10000/xf:
        f1 = "green"
    elif pocty[oof] <10000/xf:
        f1 = "red"
    canvas.create_rectangle(0+(1080/xf*oof),1080,(oof*1080/xf)+1080/xf,(1080-pocty[oof])-xf , fill = f1, outline = "")
    canvas.create_text((1080/xf*oof)/2+(1080/xf*oof),700, text = oof)
    canvas.create_text((1080/xf*oof)/2+(1080/xf*oof),650, text = pocty[oof],angle = 90)
    canvas.update()
    canvas.after(10)


print (pocty)





root.mainloop()