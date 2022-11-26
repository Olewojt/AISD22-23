import java.lang.Math;
import java.util.Random;

public class figura {

    static int iloscLosowan = 100;

    public static void run(){
        Random gen = new Random();
        for(int i=0; i<100; i++){
            double x = gen.nextInt(1001)/1000.0;
            double y = gen.nextInt(1001)/1000.0;
        }
    }
}
