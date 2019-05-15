# Python 3.6
# ShardBytes

import random

# rozpravky: array<int> s poctami precitania rozpravok
# vrati index vybranej rozpravky
def vyber(rozpravky):
    min_indexes = [] # indexy minimalnych hodnot
    minpocet = min(rozpravky) # minimalna hodnota

    for ri, r in enumerate(rozpravky):
        # ak je dana rozpravka minimalnej hodnoty
        if (r == minpocet):
            min_indexes.append(ri) # pridaj jej index do min indexov
    
    idx = random.choice(min_indexes) # vyber nahodny index rozpravky minimalnej hodnoty
    rozpravky[idx] += 1 # pridaj k hodnote 1

    return idx # vrat index tej rozpravky

def vyber_test():
    r = [1, 2, 3, 4, 11, 0, 0, 2, 0]

    print(f" -> {r}")
    for i in range(0, 10):
        idx = vyber(r)
        print(f"{idx} - {r}")

# test
if __name__ == "__main__":
    vyber_test()