import copy
import random


class PlnickaException(Exception):
    pass


class Plnicka():

    def __init__(self, pocet_sietok=8):
        """AutomatickĂ˝ systĂ©m pre plnenie sieĹĄok jablkami."""
        self.__nastav_pocet_sietok(pocet_sietok)
        self.__sietky = [list() for i in range(pocet_sietok)]
        self.__zasobnik = []
        self.__sklad = []
        self.__pocet_jablk_spat_do_zasobnika = 0
        self.__pocet_jablk_na_spracovanie = 0
        self.__pocet_sietok_do_skladu = 8
        self.__odpad = []
        self.__nastav_jablko(None)

        print("Výborne plnička funguje!")

    def __nastav_pocet_sietok(self, pocet_sietok):
        if not isinstance(pocet_sietok, int):
            raise PlnickaException('Chyba! PoÄŤet sietok musĂ­ byĹĄ celĂ© ÄŤĂ­slo.')
        if pocet_sietok < 1:
            raise PlnickaException('Chyba! PoÄŤet sieĹĄok musĂ­ byĹĄ kladnĂ˝.')
        self.__pocet_sietok = pocet_sietok

    def __vrat_pocet_sietok(self):
        return self.__pocet_sietok

    pocet_sietok = property(__vrat_pocet_sietok, doc='PoÄŤet sieĹĄok do ktorĂ˝ch je moĹľnĂ© jablkĂˇ umiestĹovaĹĄ. SieĹĄky sĂş ÄŤĂ­slovanĂ© od 0.')

    def __nastav_sietky(self):
        self.__sietky = [list() for i in range(self.pocet_sietok)]

    def __vrat_sietky(self):
        return copy.deepcopy(self.__sietky)

    sietky = property(__vrat_sietky, doc='Zoznamy jabÄşk ktorĂ© sĂş umiestnenĂ© v jednotlivĂ˝ch sieĹĄkach.')

    def __vrat_sklad(self):
        return copy.deepcopy(self.__sklad)

    def __nastav_sklad(self):
        self.__sklad = []

    sklad = property(__vrat_sklad, doc='Zoznamy jabÄşk v sieĹĄkach, ktorĂ© sĂş umiestnenĂ© v sklade.')

    def __do_zasobnika(self, prvok):
        if not isinstance(prvok, int) or prvok <= 0:
            raise PlnickaException('Chyba! Pokus o vloĹľenie neplatnĂ©ho prvku do zĂˇsobnika.')
        self.__zasobnik.append(prvok)
        self.__pocet_jablk_na_spracovanie += 1
        if 3 * self.pocet_jablk_spat_do_zasobnika > self.pocet_jablk_na_spracovanie:
            raise PlnickaException(
                'Chyba! VyzerĂˇ to tak, Ĺľe tĂˇto stratĂ©gia nie je veÄľmi ĂşspeĹˇnĂˇ. KaĹľdĂ© jablko sa do zĂˇsobnĂ­ka vrĂˇtilo priemerne viac ako 2x. Ak sa to stĂˇva ÄŤasto, pouvaĹľujte nad inou stratĂ©giou.')

    def _do_zasobnika(self, kontajner):
        """NaplnĂ­ zĂˇsobnĂ­k jablkami zo zadanĂ©ho kontajnera. Kontajner je typu zoznam.

        prĂ­klad: plnicka.do_zasobnika([100, 120])
        """
        if not isinstance(kontajner, list):
            raise PlnickaException('Chyba! Obsah kontajnera sa nedĂˇ vloĹľiĹĄ do zĂˇsobnika.')
        for prvok in kontajner:
            self.__do_zasobnika(prvok)
        kontajner.clear()

    def vyber_jablko_zo_zasobnika(self):
        """Vyberie jablko zo zĂˇsobnĂ­ka na spracovanie."""
        if self.__jablko is not None:
            raise PlnickaException('Chyba! Nie je spracovanĂ© predchĂˇdzajĂşce jablko.')
        try:
            self.__nastav_jablko(self.__zasobnik.pop(0))
        except IndexError:
            raise PlnickaException('Chyba! ZĂˇsobnik je prĂˇzdny.')

    def __nastav_jablko(self, jablko):
        self.__jablko = jablko

    def __vrat_jablko(self):
        if self.__jablko is None:
            raise PlnickaException('Chyba! Nie je spracovĂˇvanĂ© Ĺľiadne jablko.')
        return self.__jablko

    jablko = property(__vrat_jablko, doc='HmotnosĹĄ spracovĂˇvanĂ©ho jablka')

    def __je_prazdny_zasobnik(self):
        return len(self.__zasobnik) == 0

    je_prazdny_zasobnik = property(__je_prazdny_zasobnik, doc='OdpoveÄŹ na otĂˇzku: Je zĂˇsobnĂ­k prĂˇzdny?')

    def jablko_do_sietky(self, sietka):
        """Premiestni spracovĂˇvanĂ© jablko do sieĹĄky s uvedenĂ˝m ÄŤĂ­slom.

        prĂ­klad: plnicka.jablko_do_sietky(0)
        """
        if self.jablko is None:
            raise PlnickaException('Chyba! Nie je vybranĂ© jablko.')
        try:
            self.__sietky[sietka].append(self.jablko)
            self.__nastav_jablko(None)
        except (IndexError, TypeError):
            raise PlnickaException('Chyba! VkladĂˇte jablko do neexistujĂşcej sieĹĄky.')

    def sietka_do_skladu(self, sietka):
        """Premiestni uvedenĂş sieĹĄku s jablkami do skladu a na jej miesto vloĹľĂ­ prĂˇzdnu sieĹĄku"""
        try:
            self.__sklad.append(self.__sietky[sietka].copy())
            self.__sietky[sietka].clear()
            self.__pocet_sietok_do_skladu += 1
        except (IndexError, TypeError):
            raise PlnickaException('Chyba! PresĂşvate do skladu neexistujĂşcu sietku.')

    def __vrat_pocet_sietok_do_skladu(self):
        return self.__pocet_sietok_do_skladu

    pocet_sietok_do_skladu = property(__vrat_pocet_sietok_do_skladu, doc='PoÄŤet sieĹĄok, ktorĂ© boli premiestnenĂ© do skladu.')

    def sietka_do_zasobnika(self, sietka):
        """Premiestni jablkĂˇ v sieĹĄke do zĂˇsobnĂ­ka na opĂ¤tovnĂ© spracovanie a na jej miesto vloĹľĂ­ prĂˇzdnu sieĹĄku."""
        try:
            self.__pocet_jablk_spat_do_zasobnika += len(self.__sietky[sietka])
            random.shuffle(self.__sietky[sietka])
            self.__pocet_jablk_na_spracovanie -= len(self.__sietky[sietka])
            self._do_zasobnika(self.__sietky[sietka])
        except (IndexError, TypeError):
            raise PlnickaException('Chyba! PresĂşvate do zĂˇsobnĂ­ka neexistujĂşcu sieĹĄku.')

    def __vrat_pocet_jablk_spat_do_zasobnika(self):
        return self.__pocet_jablk_spat_do_zasobnika

    pocet_jablk_spat_do_zasobnika = property(__vrat_pocet_jablk_spat_do_zasobnika, doc='PoÄŤet jabÄşk, ktorĂ© boli vysypanĂ© spĂ¤ĹĄ do zĂˇsobnĂ­ka.')

    def __vrat_pocet_jablk_na_spracovanie(self):
        return self.__pocet_jablk_na_spracovanie

    pocet_jablk_na_spracovanie = property(__vrat_pocet_jablk_na_spracovanie, doc='PoÄŤet jabÄşk ktorĂ© boli nasypanĂ© do zĂˇsobnĂ­ka plniÄŤky na spracovanie. JablkĂˇ z vrĂˇtenĂ˝ch sieĹĄok sa nezapoÄŤĂ­tavajĂş.')

    def hmotnost_sietky(self, sietka):
        """HmotnosĹĄ jabÄşk v zadanej sieĹĄke."""
        try:
            return sum(self.__sietky[sietka])
        except (IndexError, TypeError):
            raise PlnickaException('Chyba! Chcete odvĂˇĹľiĹĄ neexistujĂşcu sieĹĄku.')

    def jablko_do_odpadu(self):
        """Premiestni spracovĂˇvanĂ© jablko do odpadu"""
        if self.jablko is None:
            raise PlnickaException('Chyba! Nie je vybranĂ© jablko.')
        self.__odpad.append(self.jablko)
        self.__nastav_jablko(None)

    def __vrat_odpad(self):
        return self.__odpad.copy()

    odpad = property(__vrat_odpad, doc='Zoznam jabÄşk v odpade.')

    def napln_zasobnik(self):
        """NaplnĂ­ zĂˇsobnĂ­k jablkami."""
        self._do_zasobnika([125 + random.randint(0, 60) - 30 for i in range(random.randint(90000, 100000))])

################################################################################
'''Naprogramuj funkciu spusti_plnicku()
'''

def spusti_plnicku():
    print("Spustam plnicku :)")
    ppp = Plnicka()
    12

if __name__ == "__main__":
    spusti_plnicku()