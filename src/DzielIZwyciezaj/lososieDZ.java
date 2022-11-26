import java.lang.Math;

public class lososieDZ {

    static double lososie = 1000000;
    static int minuty=0;
    static int lososixyRek(double ilosc, int minuty, double cap){
        if(ilosc <= cap) return minuty;
        else return lososixyRek(ilosc*0.996*Math.pow(Math.E,0.003), minuty+1, cap);
    }

    public static void run(){
//        lososixy();
        System.out.println("1/2 populacji po -> " + lososixyRek(lososie, 0, lososie/2) + " minutach");
        System.out.println("1/3 populacji po -> " + lososixyRek(lososie, 0, lososie/3) + " minutach");
        System.out.println("1/10 populacji po -> " + lososixyRek(lososie, 0, lososie/10) + " minutach");
        System.out.println("1/100 populacji po -> " + lososixyRek(lososie, 0, lososie/100) + " minutach");
        System.out.println("Wymarcie po -> " + lososixyRek(lososie, 0, 100) + " minutach");
    }

}
