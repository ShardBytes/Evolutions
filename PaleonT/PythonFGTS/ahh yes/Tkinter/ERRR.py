import random
import tkinter 

x = random.randint(10,500)
y = random.randint(10,500)
root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

def troj(width,height, startPointX,startPointY,color):
    canvas.create_line(startPointX,startPointY,startPointX+width,startPointY, fill = color)
    canvas.create_line(startPointX,startPointY,width/2,startPointY-height, fill = color)
    canvas.create_line(width/2,startPointY-height,startPointX + width,startPointY, fill = color)
while 1 == 1:
    troj(x,y,10,700,"red")










root.mainloop()