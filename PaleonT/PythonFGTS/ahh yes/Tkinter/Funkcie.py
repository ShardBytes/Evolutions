#fcia kresli kruh so zadanimy suradnicami stredu
import tkinter 


root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()
def kruhs(x,y):
    polomer = 50
    canvas.create_oval(x-polomer, y-polomer, x + polomer, y + polomer)


kruhs(200,150)








root.mainloop()