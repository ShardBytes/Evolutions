#fcia kresli kruh so zadanimy suradnicami stredu
import tkinter 

vys,syr = 900,1880

root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = syr, height = vys)
canvas.pack()

ttt= syr/vys
def kruhs_stred(x,y,farba):
    polomer = 15
    canvas.create_oval(x-polomer, y-polomer, x + polomer, y + polomer,fill = farba)
x, y = 15, 15

if syr>vys:
    rrr = syr-vys
    q = rrr/150
    while x<syr:
        kruhs_stred(x,y,"black")
        x+=(21+q)
        y+=((21+q)/ttt)
else:
    while x<syr:
        kruhs_stred(x,y,"black")
        x+=(21)
        y+=(21/ttt)








root.mainloop()