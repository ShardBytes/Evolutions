import tkinter 
from randcollor import randcolor
import random


root = tkinter.Tk()
canvas = tkinter.Canvas(root,bg="black", width = 800, height = 800)
canvas.pack()

x = 0
y = 0
while x <800:
    rc1 = "#"+str(randcolor())
    canvas.update()
    canvas.create_line(x, 0, 800, y, fill = rc1, width= 2 )
    x = x + random.randint(1,8)
    y = y + random.randint(1,8)
x = 800
y = 0
while x > 0:
    rc1 = "#"+str(randcolor())
    canvas.update()
    canvas.create_line(800, y, x, 800, fill = rc1, width= 2 )
    x = x - random.randint(1,8)
    y = y + random.randint(1,8)

x = 800
y = 800
while x > 0:
    rc1 = "#"+str(randcolor())
    canvas.update()
    canvas.create_line(0, x, y, 800, fill = rc1, width= 2 )
    x = x - random.randint(1,8)
    y = y - random.randint(1,8)

x = 0
y = 800
while x < 800:
    rc1 = "#"+str(randcolor())
    canvas.update()
    canvas.create_line(x, 0, 0, y, fill = rc1, width= 2 )
    x = x + random.randint(1,8)
    y = y - random.randint(1,8)








root.mainloop()