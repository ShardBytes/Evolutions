import random

def randcolor():
    r = "%0.2X" % (random.randint(1,255))
    g = "%0.2X" % (random.randint(1,255))
    b = "%0.2X" % (random.randint(1,255))

    return(r+g+b)
