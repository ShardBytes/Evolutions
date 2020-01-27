import tkinter 


root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

medz = 10
for i in range(1,12):
    print(i*10)
    canvas.create_line(10+medz*i,i*medz,400+medz*i,i*medz)
    medz+=2











root.mainloop()