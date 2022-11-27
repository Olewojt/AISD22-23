package MonteCarlo;

import java.util.Random;
import java.lang.Math;

public class figuraMC {

    static void licz(){
        Random gen = new Random();
        int nalezy=0;
        for(int i=0; i<100; i++) {
            double x = gen.nextInt(1001) / 1000.0;
            double y = gen.nextInt(1001) / 1000.0;
            if(y <= Math.sin(x)) nalezy++;
        }

        System.out.println("Nalezy: "+nalezy);
        System.out.println((nalezy/100.0));
    }

    public static void run(){
        licz();
    }

}
