#in 2 rovnako dlhe stringy 

def combinatoor(sé,sí):
    x = ""
    
    for i in range(0,len(sé)):
        x+= sé[i] + sí[i]
    
    return x        




while True:
    a,b = input("S1: "),input("S2: ")
    if len(a) == len(b):
        print(combinatoor(a,b))
        break
    else:
        print("NIGGA COME AGAIN?")
        
    

    
 
