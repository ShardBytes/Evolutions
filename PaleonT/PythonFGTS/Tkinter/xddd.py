import tkinter 



root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

def Nclen(x):
    i = (x**2)
    return(i)

canvas.create_line(0,400,800,400)

p = 1
while p<= 800:
        x = Nclen(p)
        xNext = Nclen(p+1)
        canvas.create_line(0+p,410+x,1+p,411+xNext)

        p+=1

        canvas.update()
        
       
        
        



root.mainloop()