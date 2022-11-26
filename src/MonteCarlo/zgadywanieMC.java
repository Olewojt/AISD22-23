import java.util.Random;

public class zgadywanieMC {

    static int losy = 100;
    static int limit = 100;

    static void losuj(int min, int max, int zgadywana, int iloscLosowan) {
        Random gen = new Random();
        int[] limity = {min, max}; // zapamietaj wejsciowy limit dla kazdego losowania
        int[] wynik = new int[limit]; // tablica lokalnych wynikow
        int[] rozw = new int[limit]; // tablica z najlepszym wynikiem
        int MIN_WYNIK = Integer.MAX_VALUE; // najmniejsza liczba zgadywan
        ;
        for (int i = 0; i < iloscLosowan; i++) {
            int ilosc = 0;
            min = limity[0];
            max = limity[1];

            while (true) {
                int liczba = gen.nextInt(min+1, max); // min+1 bo jest wlaczone do zakresu
                wynik[ilosc] = liczba;
                ilosc++;
                if (liczba == zgadywana) break;
                if (liczba < zgadywana) min = liczba; // Jesli liczba mniejsza od zgadywanej to zmieniam przedzial
                else if (liczba > zgadywana) max = liczba;
            }

            // Przyklad:
            //  liczba do zgadniecia: 11
            //  liczba ktora zgadl komputer -> 573
            //  Zakres poczatkowy to bylo [0;1000]
            //  573 > 11 wiec mozemy zmienic na [0;573]

            if (ilosc < MIN_WYNIK) {
                MIN_WYNIK = ilosc;
                for (int k = 0; k < MIN_WYNIK; k++) {
                    rozw[k] = wynik[k];
                }
            }
        }

        System.out.println("\nIlosc zgadywan: " + MIN_WYNIK);
        for (int s = 0; s < MIN_WYNIK; s++) {
            System.out.print(rozw[s] + " | ");
        }

    }

    public static void run() {
        losuj(0,1000,9,losy);
    }
}
