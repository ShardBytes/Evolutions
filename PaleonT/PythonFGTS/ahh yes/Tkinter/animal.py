#fcia kresli kruh so zadanimy suradnicami stredu
import tkinter 
from math import sqrt

vys,syr = 900,1880

root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = syr, height = vys,bg = "white")
canvas.pack()

x = int(input("x"))
y = int(input("y"))

dlzkaStranyx = int(input("dlzka strany"))


def stvoc(x,y , dlzkaStrany):
    inc = dlzkaStrany//2
    canvas.create_rectangle(x-inc,y-inc,x+inc,y+inc)


stvoc(x,y,dlzkaStranyx)

print(sqrt((dlzkaStranyx**2)+(dlzkaStranyx**2)))
root.mainloop()