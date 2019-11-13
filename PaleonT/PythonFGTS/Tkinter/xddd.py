import tkinter 
from math import sin



root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

def Nclen(x):
    i = (sin(x/22))
    return(i)

canvas.create_line(0,399,800,399)
canvas.create_line(399,0,399,800)

p = 1
while p<= 800:
        x = Nclen(p)
        xNext = Nclen(p+1)
        canvas.create_line(00+p,800+x,1+p,801+xNext,fill = "red")

        p+=1

        canvas.update()
        
       

        



root.mainloop()