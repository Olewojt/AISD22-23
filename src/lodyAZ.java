public class lodyAZ {
    static int smaki = 6;

    static int[][] czasy = {
            {0,7,20,21,12,23},
            {27,0,13,16,46,5},
            {53,15,0,25,27,6},
            {16,2,35,0,47,10},
            {31,29,5,18,0,4},
            {28,24,1,17,5,0}
    };

    static void malyCzas(){
        int[] rozw = new int[smaki];
        boolean[] wybrane = new boolean[smaki];
//        wybrane[0]=true;

        int min = Integer.MAX_VALUE;
        int czas = 0;
        int pos = 0;
        int tmp = 0;
        int count = 0;

        while(true){
            wybrane[pos]=true;
            if(count==smaki) break;
            for(int i=0; i<smaki; i++) {
                if (czasy[pos][i] <= min && !wybrane[i]) {
                    min = czasy[pos][i];
                    tmp = i;
                }
            }
            if(count == smaki-1) min = czasy[pos][0];
            pos = tmp;
            System.out.printf("Pozycja: %d | Czas: %d \n", pos, min);
            czas+=min;
            min = Integer.MAX_VALUE;
            count++;
        }



//        System.out.println("Rozwiazanie: ");
//        for(int i=0; i<smaki; i++){
//            System.out.print(rozw[i] + " ");
//        }
        System.out.print("\n Czas: " + czas);

    }

    public static void run(){
        malyCzas();
    }
}
