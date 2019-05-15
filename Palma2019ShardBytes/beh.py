import copy
import random
import time

class Preteky():
    def __init__(self, pocet_kontrol=None, pocet_pretekarov=None):
        self.__pridaj_pred = 0.25
        self.__pridaj_za = 0.25
        self.__pridaj_do = 0.25
        self.__zmaz_z = 0.25

        if pocet_pretekarov is None:
            self.__nastav_pocet_pretekarov(random.randrange(1, 21))
        else:
            self.__nastav_pocet_pretekarov(pocet_pretekarov)

        if pocet_kontrol is None:
            self.__nastav_pocet_kontrol(random.randrange(2, 50))
        else:
            self.__nastav_pocet_kontrol(pocet_kontrol)

        self.__generuj_zaznamy_pretekov()

    def __generuj_zaznamy_pretekara(self, meno):
        kontroly = [i for i in range(1, self.pocet_kontrol)]
        if len(kontroly) > 1 and random.random() < self.__pridaj_do:
            kontroly.insert(random.randrange(1, len(kontroly)),
                            random.randrange(0, self.pocet_kontrol))
        if random.random() < self.__zmaz_z:
            kontroly.pop(random.randrange(0, len(kontroly)))
        if random.random() < self.__pridaj_pred:
            kontroly.insert(0, random.randrange(0, self.pocet_kontrol))
        if random.random() < self.__pridaj_za:
            kontroly.insert(self.pocet_kontrol,
                            random.randrange(0, self.pocet_kontrol))
        kontroly.insert(0, 0)
        zaznamy_pretekara = []
        cas = int(time.time()) - 10000 + random.randint(0, 100)
        zaznamy_pretekara.append([kontroly[0], meno, cas])
        for i in range(1, len(kontroly)):
            cas = cas + abs(kontroly[i] - kontroly[i - 1]) * 100 + random.randrange(0, 10 * (abs(kontroly[i] - kontroly[i - 1]) + 1))
            zaznamy_pretekara.append([kontroly[i], meno, cas])
        return zaznamy_pretekara

    def __vrat_pocet_kontrol(self):
        return self.__kontroly

    def __nastav_pocet_kontrol(self, pocet_kontrol):
        if not isinstance(pocet_kontrol, int):
            raise TypeError('Chyba! PoÄŤet kontrol musĂ­ byĹĄ celĂ© ÄŤislo.')
        if pocet_kontrol < 2:
            raise ValueError('Chyba! PoÄŤet kontrol musĂ­ byĹĄ aspoĹ 2.')
        self.__kontroly = int(pocet_kontrol)

    pocet_kontrol = property(__vrat_pocet_kontrol)

    def __vrat_pocet_pretekarov(self):
        return self.__pretekarov

    def __nastav_pocet_pretekarov(self, pocet_pretekarov):
        if not isinstance(pocet_pretekarov, int):
            raise TypeError('Chyba! PoÄŤet pretekarov musĂ­ byĹĄ celĂ© ÄŤislo.')
        if pocet_pretekarov < 1:
            raise ValueError('Chyba! PoÄŤet pretekĂˇrov musĂ­ byĹĄ aspoĹ 1.')
        self.__pretekarov = int(pocet_pretekarov)

    pocet_pretekarov = property(__vrat_pocet_pretekarov)

    def __generuj_zaznamy_pretekov(self):
        self.__zaznamy_pretekov = []
        for i in range(self.pocet_pretekarov):
            self.__zaznamy_pretekov += self.__generuj_zaznamy_pretekara(i)
        random.shuffle(self.__zaznamy_pretekov)

    def __vrat_zaznamy_pretekov(self):
        return copy.deepcopy(self.__zaznamy_pretekov)

    zaznamy_pretekov = property(__vrat_zaznamy_pretekov)


'''
Pouzitie generatora zaznamov pretekov: Preteky(pocet_kontrol, pocet_pretekarov)

preteky = Preteky(5, 3)
pocet_pretekarov = preteky.pocet_pretekarov
pocet_kontrol = preteky.pocet_kontrol
zaznamy_pretekov = preteky.zaznamy_pretekov
'''

'''
Vytvor funkciu vysledkova_listina() s vhodnĂ˝mi parametrami.
'''



def vysledkova_listina(preteky):
    # [kontrola, id, cas]

    z = preteky.zaznamy_pretekov
    hraci = {}
    diskvalifikovani = []
    vyherci_s_casmi = [] # [id_hraca, cas]
    
    # mapa s hracmi
    for x in z:
        if x[1] in hraci.keys():
            hraci[x[1]].append(x)
        else:
            hraci[x[1]] = [x]

    # diskvalifikuj pretekarov
    for hrac in range(0, preteky.pocet_pretekarov):
        if hrac not in diskvalifikovani:
            # zober jeho kontroly
            kontroly_hraca = list(map(lambda x: x[0], hraci[hrac]))

            for kontrola in range(0, preteky.pocet_kontrol):
                if kontrola not in kontroly_hraca:
                    #diskvalifikuj
                    diskvalifikovani.append(hrac)

    # zisti vyhercov
    for hrac in range(0, preteky.pocet_pretekarov):
        if hrac not in diskvalifikovani:
            ciele_hraca = list(filter(lambda x: x[0] == 4, hraci[hrac]))
            starty_hraca = list(filter(lambda x: x[0] == 0, hraci[hrac]))

            # posortuj podla casu, najstarsi cas je najmensi
            # [0] -> najmensi cas lebo sorted, [2] -> extrahuj cas z entry
            start = sorted(starty_hraca, key=lambda x: x[2])[0][2]
            ciel = sorted(ciele_hraca, key=lambda x: x[2])[0][2]
            cas = ciel - start
            
            vyherci_s_casmi.append([hrac, cas])

    # posortuj vyhercoch!!! podla casoch
    vyherci_s_casmi.sort(key=lambda x: x[1])

    # vrati dvojrozmerne pole:
    # vyherci -> umiestnenie podla poradia, prvky -> [id_hraca, cas_hraca]
    # diskvalifikovani -> [id_hraca]
    return [vyherci_s_casmi, diskvalifikovani]

def vysledkova_listina_test():
    p = Preteky(5, 3)
    print(vysledkova_listina(p))

if __name__ == "__main__":
    vysledkova_listina_test()