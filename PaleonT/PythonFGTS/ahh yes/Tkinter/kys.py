import random
import tkinter 
from randcollor import randcolor




por = 1
root = tkinter.Tk()
canvas = tkinter.Canvas(root, width = 800, height = 800)
canvas.pack()



for i in range(10000) :
    x = random.randint(20,600)
    y = random.randint(20,600)
    velkost = random.randint(20,200)
    rc1 = "#"+str(randcolor())
    rc2 = "#"+str(randcolor())
    canvas.create_polygon(x,y,x+velkost,y+velkost,x*velkost, y/velkost,fill = rc1, outline= rc2,width=11)
    canvas.create_text((x+(velkost/2)),(y+(velkost/2)),text=i+1)
    canvas.update()
   











root.mainloop()