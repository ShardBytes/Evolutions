def nsd(x,y):
    mod =1
    a = x
    b = y
    while mod > 0 :
        mod = a%b
        a=b
        b = mod
    return a     

print(nsd(23,11))