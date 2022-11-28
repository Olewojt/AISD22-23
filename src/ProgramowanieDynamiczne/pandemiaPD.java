package ProgramowanieDynamiczne;
public class pandemiaPD {
    static int ludnosc = 100000;
    static int[] chorzy = new int[100];

    static void rozw(){
        int dni=1;
        chorzy[1]=10;
        while(true){
            if(chorzy[dni]<=0) {
                chorzy[dni]=0;
                break;
            };
            dni++;
            chorzy[dni] = chorzy[dni-1]*3;
            if (chorzy[dni]<ludnosc) {
                if(dni>7) chorzy[dni]-=chorzy[dni-7];
            } else {
                chorzy[dni] = ludnosc;
                if(dni>7) chorzy[dni]-=chorzy[dni-7];
            }
            System.out.println("Dzien: "+dni);
            System.out.println("Chorzy: "+chorzy[dni]);
            if(dni>7) System.out.println("Chorzy tydzien temu: "+chorzy[dni-7]+ "\n");
        }
        System.out.println("Dni: "+(dni));
        for(int i=1; i<dni; i++){
            System.out.print("["+chorzy[i]+"] ");
        }
    }

    public static void run(){
        rozw();
    }
}
