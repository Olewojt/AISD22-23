public class ProblemPlecakowy {
    public static void run() {
        System.out.println("Problem Plecakowy!");

        int tab[][] = {
                {6, 6},
                {2, 4},
                {3, 5},
                {2, 7},
                {3, 10},
                {1, 2}
        };

        // jakim cudem to dziala to ja nie wiem

        int v; // Objetosc
        int value;// Wartosc
        int max=0;
        int res[] = new int[6];
        int res2[] = new int[6];

        for (int i = 0; i < 6; i++) {
            v = tab[i][0];
            value = tab[i][1];
            for(int s=0; s<6; s++) res[s]=9; // Wypelnianie tablicy nieistniejacymi elem.
            res[i] = i;
            for (int k=i+1; k < 6; k++) {
                if (v + tab[k][0] <= 10) {
                    v += tab[k][0];
                    value += tab[k][1];
                    res[k]=k;
                }
            }
            if(value >= max){
                res2 = res.clone(); // kopiowanie indeksow do drugiej tablicy
                max = value; // zmiana maks. wartosci
            }
//            System.out.printf("V: %d \n" +
//                    "Value: %d \n\n", v, value);
        }
        System.out.printf("Max: %d\n", max);
        for(int l=0; l<6; l++){
            if(res2[l] != 9){
                System.out.print(res2[l] + " ");
            }
        }
    }
}
