public class drogaAZ {
    static int ilosc = 9;
    static int[][] droga = {
            {0, 300, 402, 356, 0, 0, 0, 0, 0}, // wwa
            {300, 0, 0, 0, 440, 474, 0, 0, 0}, // kato
            {402, 0, 0, 0, 0, 330, 0, 0, 0}, // zakopiec
            {356, 0, 0, 0, 0, 0, 823, 0, 0}, // lviv
            {0, 440, 0, 0, 0, 0, 0, 430, 0}, // wied
            {0, 474, 330, 0, 0, 0, 813, 365, 774}, // budi
            {0, 0, 0, 823, 0, 813, 0, 0, 403}, // buka
            {0, 0, 0, 0, 430, 365, 0, 0, 768}, // grzeb
            {0, 0, 0, 0, 0, 774, 403, 768, 0}, // sofia
    };

    static void drogaKrotka(){
        int min;
        int pos = 0;
        int tmp = 0;
        int sumaKm = 0;
        boolean odwiedzone[] = new boolean[ilosc];
        odwiedzone[0]=true;

        while(true){
            System.out.println("Przechodze do "+pos+" miasta.");
            if(pos==8) break;
            min = Integer.MAX_VALUE;
            for(int i=0; i<ilosc; i++){
                if(!odwiedzone[i]) {
                    if (droga[pos][i] != 0) {
                        if(i==8){
                            min = droga[pos][8];
                            tmp = 8;
                            break;
                        }
                        if (droga[pos][i] <= min) {
                            min = droga[pos][i];
                            tmp = i;
                        }
                    }
                }
            }
            odwiedzone[tmp]=true;
            sumaKm += min;
            pos=tmp;
        }

        System.out.println("Droga: "+sumaKm);
    }

    public static void run(){
        drogaKrotka();
    }
}
