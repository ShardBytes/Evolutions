import tkinter 



root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

def Nclen(x):
    
    return()

canvas.create_line(0,410,800,410)
canvas.create_line(400,0,400,800)

for u in range(1,400):
    for i in reversed(range(1,400)):
        x = 1+1/i
        s,e = 400,400
        canvas.create_line(s+u*2,e,s+1+u*2,e-x,fill = "black")
        
        canvas.after(1)
        canvas.update()
    



root.mainloop()