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

        int min;
        int czas = 0;
        int pos = 0;
        int tmp = 0;
        int count=0;
        int tmp2;

        while(true){
            tmp2 = pos;
            if(count==6) break;
            min = Integer.MAX_VALUE;
            if(!wybrane[pos]) {
                for (int i = 0; i < smaki; i++) {
                    if (czasy[pos][i] <= min && czasy[pos][i] != 0) {
                        min = czasy[pos][i];
                        tmp = i;
                    }
                }
                count++;
            }
            czas+=min;
            pos = tmp;
        }

//        System.out.println("Rozwiazanie: ");
//        for(int i=0; i<smaki; i++){
//            System.out.print(rozw[i] + " ");
//        }
        System.out.print("Czas: " + czas);

    }

    public static void run(){
        malyCzas();
    }
}
