import tkinter 


root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

def kruh(xy):
    x = xy.x
    y = xy.y
    while True:
        canvas.create_oval(x-5,y-5,x+5,y+5)



canvas.bind("<Button-1>", kruh)








root.mainloop()