public class pandemiaDZ {
    static int ludzie = 100000;
    static int chorzy = 10;

    static int zaraza(int chorzy, int dni, int[] pamiec){
        if(chorzy>ludzie) chorzy=ludzie;
        pamiec[dni+1]=chorzy;
        if(dni>=7) chorzy-=pamiec[dni-7];
        if(chorzy==0) return dni+1;
        else return zaraza(chorzy*3, dni+1, pamiec);
    }

    public static void run() {
        System.out.println(zaraza(chorzy, 0, new int[100]));
    }
}

