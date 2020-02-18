olsov = int(input("zadaj cele čislo: "))




for t in range (1,olsov+1):
    control = t
    sucet = 0
    for i in range(1,t+1): 
        if t % i == 0:
            sucet = sucet + i
    if control == sucet - control:
        print(t,end=" ")            