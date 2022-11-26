public class plecakowyAZ {
    final static int N = 6;
    final static int MAX_V = 10;

    final static int[] V = {6,2,3,2,3,1};
    final static int[] W = {6,4,5,7,10,2};

    public static void pakujMale(){
        boolean[] rozw = new boolean[N];

        // Uzupelniam tablice rozwiazan
        for(int i=0; i<N; i++) rozw[i] = false;

        int sumW = 0;
        int sumV = 0;

        while(true){
            int minV = Integer.MAX_VALUE;
            int maxPoz = -1;

            for(int k=0; k<N; k++){
                if(!rozw[k]){
                    if( (sumV+V[k]<=MAX_V) && (V[k]<minV) ){
                        minV = V[k];
                        maxPoz = k;
                    }
                }
            }

            if(maxPoz > -1){
                rozw[maxPoz] = true;
                sumW = sumW + V[maxPoz];
                sumV = sumV + W[maxPoz];
            }else break;
        }

        System.out.println("Wartosc optymalnie zapakowanego plecaka - metoda PAKUJ MALE: " + sumW);
        System.out.print("Przedmioty w plecaku: ");

        for (int i = 0; i < N; i++) // Wypisanie przedmiotow
            if (rozw[i])
                System.out.print(i + " ");

        System.out.println();
    }

    public static void pakujCenne(){
        boolean[] rozw = new boolean[N]; // defaultowo wypelniona jest false'ami

        int sumV = 0;
        int sumW = 0;

        while(true){
            int maxPos=-1;
            int maxW=-1; // minimalna wartosc

            for(int i=0; i<N; i++){
                if(!rozw[i]){
                    if( (V[i]+sumV <= MAX_V) && (W[i]>=maxW)){
                        maxW = W[i];
                        maxPos = i;
                    }
                }
            }
            if(maxPos > -1){
                rozw[maxPos]=true;
                sumV += V[maxPos];
                sumW += W[maxPos];
            }else{
                break;
            }
        }

        System.out.println("Spakowanie przedmioty: ");
        for(int k=0; k<N; k++){
            if(rozw[k]) System.out.print(k+" ");
        }
        System.out.println("Wartosc: "+sumW);

    }

    public static void pakujDuze(){
        boolean[] rozw = new boolean[N];

        int sumW=0;
        int sumV=0;

        while(true){
            int maxPos=-1;
            int minV=-1;

            for(int i=0; i<N; i++){
                if(!rozw[i]){
                    if( (sumV+V[i] <= MAX_V) && (V[i]>=minV)){
                        maxPos = i;
                        minV = V[i];
                    }
                }
            }

            if(maxPos>-1){
                rozw[maxPos]=true;
                sumV+=V[maxPos];
                sumW+=W[maxPos];
            }else break;
        }

        System.out.println("Przedmioty: ");
        for(int i=0; i<N; i++){
            if(rozw[i]) System.out.print(i+" ");
        }
        System.out.print("\n Wartosc: " + sumW);
    }

    public static void run(){
        pakujDuze();
    }
}
