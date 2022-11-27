package MonteCarlo;
import java.util.Random;

public class zalogaMC {
    static int zaloganci = 5;
    static int ileKwal = 4;

    static int[][] skills = {
            {1,0,0,1},
            {0,1,0,1},
            {0,1,1,0},
            {1,1,0,0},
            {0,0,1,1},
    }; //    A B C D

    static boolean[] wynik = new boolean[zaloganci]; // zaloga ktora poleci

    static void losuj(int ile) {
        Random gen = new Random();
        int count = 0; // licznik kwalifikacji (jesli 4 wyskakuje z petli)
        for (int k = 0; k < ile; k++){
            count = 0;
            int min=6; // minimum osob ktore poleca
            int licz=0; // licznik osob ktore leca (do zmiany minimum) ((pewnie jakos mozna zrobic bez tego))
            boolean[] kwalifikacje = new boolean[ileKwal];
            boolean[] zaloga = new boolean[zaloganci];
            while (true) {
                if (count == ileKwal) break;
                int numer = gen.nextInt(zaloganci);
                if (!zaloga[numer]) {
                    for (int i = 0; i < ileKwal; i++) {
                        if (skills[numer][i] == 1 && !kwalifikacje[i]) {
                            kwalifikacje[i] = true;
                            count++;
                        }
                    }
                    licz++;
                    zaloga[numer] = true;
                }
            }
            if(licz<=min){
                wynik = new boolean[zaloganci];
                for(int i=0; i<zaloganci; i++){
                    wynik[i]=zaloga[i];
                }
            }
        }
        for(int s=0; s<zaloganci; s++){
            if(wynik[s]) System.out.print("k"+(s+1)+" ");
        }
    }

    public static void run(){
        losuj(10);
    }
}
