package ProgramowanieDynamiczne;
public class bakteriePD {

    static int[] progi = {1000, 10000, 100000, 1000000};

    // divide et vince ciupapi munianio mi amigo por favor
    static int bakterie(int ile, int czas){
        if(ile==1) return czas+2;
        else return bakterie(ile/2, czas+2);
    }

    static int bakterieDyn(){
        return 1 // do zrobienia
    }

    public static void run(){
        System.out.println(bakterie(progi[3],0));
    }
}
