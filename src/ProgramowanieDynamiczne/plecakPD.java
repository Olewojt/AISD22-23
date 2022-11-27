package ProgramowanieDynamiczne;

public class plecakPD {

    final static int N = 6;                // liczba przedmiotów
    final static int MAX_V = 10;           // objetość plecaka

    final static int[] V = {6, 2, 3, 2, 3, 1};  // objetości przedmiotów
    final static int[] W = {6, 4, 5, 7, 10, 2}; // wartości przedmiotów

    static void rozw(){
        int[][] tab = new int[N][MAX_V + 1]; //Dla objetosci: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // oraz dla przedmiotow 0, 1, 2, 3, 4, 5

        for (int v = 0; v <= MAX_V; v++) //Wypelnianie pierwszego wiersza
        {
            if (v < V[0]) tab[0][v] = 0;
            else tab[0][v] = W[0];
        }

        //              0   1   2   3   4   5   6   7   8   9   10
        // Przedmiot 0: 0   0   0   0   0   0   0   6   6   6   6

        for (int i = 1; i < N; i++) //Wypelnianie pozostalych wierszy
        {
            for (int v = 0; v <= MAX_V; v++) //Po wszystkich objetosciach (kolumnach)
            {
                if (v < V[i]) tab[i][v] = tab[i - 1][v];
                else {
                    int p1 = tab[i - 1][v];
                    int p2 = W[i] + tab[i - 1][v - V[i]];
                    if (p1 > p2) tab[i][v] = p1;
                    else tab[i][v] = p2;
                }
            }
        }
        //  V = {6, 2, 3, 2, 3, [1]}
        //  W = {6, 4, 5, 7, 10, [2]};
        //
        //              0   1   2   3   4   5   6   7   8   9   10
        // Przedmiot 0: 0   0   0   0   0   0   6   6   6   6   6
        // Przedmiot 1: 0   0   4   4   4   4   6   6   10  10  10
        // Przedmiot 2: 0   0   4   5   5   9   9   9   10  11  11
        // Przedmiot 3: 0   0   7   7   11  12  12  16  16  16  17
        // Przedmiot 4: 0   0   7   10  11  17  17  21  22  22  26
        // Przedmiot 5: 0   2   7   10  12  17  19  21  23  24  26

        //Wypisanie tablicy z rozwiazaniami
        /**/
        System.out.println("v =\t0    1    2    3    4    5    6    7    8    9   10");
        /**/
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < N; i++) {
            /**/
            System.out.print("i = " + i + "|");
            for (int j = 0; j <= MAX_V; j++) {
                int val = tab[i][j];
                if (val < 100) System.out.print(" ");
                if (val < 10) System.out.print(" ");
                System.out.print(val + "  ");
            }
            System.out.println();
        }
    }

    static void mojeRozw(){
        int[][] tab = new int[N][MAX_V+1]; // tablica wartosci Objetosc/Przedmioty

        // Dla pierwszego rzedu
        for(int v=0; v<=MAX_V; v++){
            if(v < V[0]) tab[0][v] = 0;
            else tab[0][v] = W[0];
        }

        for(int i=1; i<N; i++){
            for(int v=0; v<=MAX_V; v++){
                if(v<V[i]) tab[i][v] = tab[i-1][v];
                else{
                    int p1 = tab[i-1][v];
                    int p2 = W[i] + tab[i-1][v-V[i]];
                    if(p1 > p2) tab[i][v] = p1;
                    else tab[i][v] = p2;
                }
            }
        }

        for(int s=0; s<=MAX_V; s++) System.out.print(s+"\t");
        for(int i=0; i<N; i++){
            System.out.println();
            for(int k=0; k<=MAX_V; k++){
                System.out.print(tab[i][k]+"\t");
            }
        }
    }
    public static void run() {
//        rozw();
        mojeRozw();
    }

}
