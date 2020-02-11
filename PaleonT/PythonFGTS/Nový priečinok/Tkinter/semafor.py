import tkinter 



root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()

def kruhs_stred(x,y,farba):
    polomer = 50
    canvas.create_oval(x-polomer, y-polomer, x + polomer, y + polomer,fill = farba)


timer = [10,6,11,5]
canvas.create_rectangle(100,10,200,310, fill = "black")
while True:
    for i in timer:
        if i == 10:
            kruhs_stred(150,160,"black")
            kruhs_stred(150,60,"red")
            canvas.after(i*100)
            canvas.update()  
        elif i == 6:
            kruhs_stred(150,160,"orange")
            canvas.after(i*500)
            canvas.update()  
        elif i == 11:
            kruhs_stred(150,60,"black")
            kruhs_stred(150,160,"black")
            kruhs_stred(150,260,"green")
            canvas.after(i*100)  
            canvas.update()  
        else:
            kruhs_stred(150,260,"black")
            kruhs_stred(150,160,"orange")
            canvas.after(i*500)  
            canvas.update()  







root.mainloop()