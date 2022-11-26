public class zalogaAZ {

    static int zaloganci = 5;
    static int ileKwal = 4;

    static int[][] skills = {
            {1,0,0,1},
            {0,1,0,1},
            {0,1,1,0},
            {1,1,0,0},
            {0,0,1,1},
    }; //    A B C D

    static boolean[] kwalifikacje = new boolean[ileKwal];
    static boolean[] zaloga = new boolean[zaloganci];

    static void poKolei(){
        int badanyZalogant = 0;
        int iloscKwal = 0;
        while(true){
            for(int i=0; i<ileKwal; i++){
                if(skills[badanyZalogant][i]==1 && !kwalifikacje[i]) {
                    kwalifikacje[i]=true;
                    zaloga[badanyZalogant]=true;
                    iloscKwal++;
                }
            }
            badanyZalogant++;
            if(iloscKwal==ileKwal) break;
        }

        System.out.println("Zaloga ktora moze poleciec: ");
        for(int i=0; i<zaloganci; i++){
            if(zaloga[i]==true){
                System.out.print("k"+(i+1) + " ");
            }
        }
    }

    public static void run(){
        poKolei();
    }
}
