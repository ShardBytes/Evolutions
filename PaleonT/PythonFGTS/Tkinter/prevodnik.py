import tkinter 

vys,syr = 300,300

root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = syr, height = vys)
canvas.pack()

canvas.create_text(150,130,text = "Zadaj sumu v €")

entry1 = tkinter.Entry (root) 
canvas.create_window(150, 150, window=entry1)

def convert():
    x = float(entry1.get())

    label1 = tkinter.Label(root, text= x*25.5)
    canvas.create_window(150, 200, window=label1)

button = tkinter.Button(text = "Konvertuj", command = convert)
canvas.create_window(150,180,window = button)

root.mainloop()