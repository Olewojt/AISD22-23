package ProgramowanieDynamiczne;

public class krolikiPD {
    //          { 1                  dla n=0
    // fib(n) = { 1                  dla n=1
    //          { fib(n-2)+fib(n-1)  dla n>1
    //


    static int ile=10;
    static int[] progi={100, 1000, 10000,100000};

    static int fib(int n, int[] pamiec){
        if(n==1 || n==2) return 1;
        if(pamiec[n]==0) pamiec[n] = fib(n-2,pamiec)+fib(n-1,pamiec);
        return pamiec[n];
    }

    public static void run(){
        int count = 1;
        int progiCount = 0;
        while(true){
            if(progiCount==4) break;
            if(fib(count, new int[count+1]) > progi[progiCount]){
                System.out.println("Prog " + progi[progiCount] + " krolikow osiagnie w "+count+" dni");
                progiCount++;
            }
            count++;
        }
    }
}
