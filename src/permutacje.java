class permutacje {
    final static int N = 6; // permutacje n-elementowe

    private static int[] l = new int[N];
    private static int[] res = new int[N];

    private static int[][] wagi = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0},
    };


    private static int val;
    private static int max = Integer.MAX_VALUE;

    // Dobry Jezu a nasz panie daj mi zrobic to zadanie
    static void permutacje(int i) {
        if (i == N) {
            val = 0;
            for (int j = 0; j < N; j++){
//                System.out.print(l[j] + " ");
                if(j==N-1){ // Jeśli j osiagnie wartosc N to wyskoczy out of bounds
                    val+=wagi[l[j]-1][l[0]-1];
                } else{
                    val+=wagi[l[j]-1][l[j+1]-1];
                }
            }
            res = l.clone(); // Klonuje wyniki
            if(val <= max){ // Jesli wartosc wyszla mniejsza od maxa to zmieniam maxa i wypisuje elementy
                max = val;
                for(int s=0; s<N; s++) System.out.print(res[s] + " ");
                System.out.println(" ---> " + val);
            }
        } else {
            for (int j = 1; j <= N; j++) {
                int k;
                for (k = 0; k < i; k++) if (l[k] == j) break;

                if (k == i) {
                    l[k] = j;
                    permutacje(i + 1);
                }
            }
        }
    }
}
