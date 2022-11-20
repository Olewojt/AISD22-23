import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LosowanieLiczb {
    static int MAX = 1000;
    static int MIN = 1;

    // Losowanie liczby
    static int losuj(int min, int max){
        Random gen = new Random();
        return gen.nextInt(max);
    }

    static void zgadywanie(int liczba_cel, int min, int max){
        try{ // Opoznienie (dla efektu)
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        int liczba = (min+max)/2;
        System.out.println("\nProponuje liczbe: " + liczba);

        if(liczba > liczba_cel){
            System.out.println("Liczba -> " + liczba + " jest ZA DUZA");
            zgadywanie(liczba_cel, min, liczba);
        }
        if(liczba < liczba_cel){
            System.out.println("Liczba -> " + liczba + " jest ZA MALA");
            zgadywanie(liczba_cel, liczba, max);
        }

        if(liczba == liczba_cel) System.out.println("Udalo sie! Ta liczba to --> " + liczba);

    }

    public static void run() {
        int liczba = losuj(MIN, MAX); // Liczba do odgadniecia
        System.out.println("Liczba do odgadniecia to: " + liczba);

        zgadywanie(liczba, MIN, MAX);
    }
}
