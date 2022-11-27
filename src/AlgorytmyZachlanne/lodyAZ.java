package AlgorytmyZachlanne;


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

        int min=Integer.MAX_VALUE;
        int teraz=0;

        // Znajduje najmniejszy czas na przestrojenie maszyny
        for(int i=0; i<smaki; i++){
            for(int k=0; k<smaki; k++){
                if(czasy[i][k]!=0){
                    if(czasy[i][k]<min){
                        min=czasy[i][k];
                        teraz=i;
                    }
                }
            }
        }

        int poczatek=teraz;
        int tmp=0;
        int czas=0;
        int count=0;

        while(true){
//            System.out.println(count);
            if(count==smaki-1){
                czas+=czasy[count][poczatek];
                break;
            }
            int minimum = Integer.MAX_VALUE;
            if(!wybrane[teraz]) {
                for(int i=0; i<smaki; i++){
                    if(czasy[teraz][i]!=0){
                        if(czasy[teraz][i]<minimum && !wybrane[i]){
                            minimum=czasy[teraz][i];
                            tmp=i;
                        }
                    }
                }
                System.out.println("Smak: "+(tmp+1) + " Minimum: "+ minimum);
                count++;
                wybrane[teraz]=true;
            }
            czas+=minimum;
            teraz = tmp;
        }

        System.out.println(czas);

    }

    public static void run(){
        malyCzas();
    }
}
