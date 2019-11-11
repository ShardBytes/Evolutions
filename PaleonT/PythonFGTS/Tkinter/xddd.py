import tkinter 
from math import sin



root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

def Nclen(x):
    i = (x)
    return(i)

canvas.create_line(0,400,800,400)


p = 1
while p<= 800:
        x = Nclen(p)
        xNext = Nclen(p+1)
        canvas.create_line(00+p,400+x,1+p,401+xNext)

        p+=1

        canvas.update()
        
       
def obsahPodFunkciou(x1,x2):
    xx,xc = x1,x2
    obsah = 0
    while xx != xc:
        obsah = (Nclen(xx)*xx)+obsah
        xx += 0.1
    return obsah
print (obsahPodFunkciou(0,1))
       
        



root.mainloop()