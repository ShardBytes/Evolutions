import tkinter 

root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

def troj(width,height, startPointX,startPointY,color):
    canvas.create_line(startPointX,startPointY,startPointX+width,startPointY, fill = color)
    canvas.create_line(startPointX,startPointY,width/2,startPointY-height, fill = color)
    canvas.create_line(width/2,startPointY-height,startPointX + width,startPointY, fill = color)

troj(500,300,10,700,"red")










root.mainloop()