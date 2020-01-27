


def oobdlznik(a,b):
    S = a*b
    return S

def Nclen(x):
    i = (x)
    return(i)


def obsahPodFunkciou(x1,x2):
    xx,xc = x1,x2
    obsah = 0
    while xx <= xc:
        o = Nclen(xx)
        obsah = (o*0.0000001) + obsah
        xx += 0.0000001
    return obsah

print(obsahPodFunkciou(0,3))