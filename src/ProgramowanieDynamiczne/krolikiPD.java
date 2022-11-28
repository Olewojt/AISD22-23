package ProgramowanieDynamiczne;

public class krolikiPD {
    //          { 1                  dla n=0
    // fib(n) = { 1                  dla n=1
    //          { fib(n-2)+fib(n-1)  dla n>1
    //


    static int ile=10;
    static int[] progi={100, 1000, 10000,100000};

    // Tu napewno będą wszystkie wyniki bo nakurwiamy po wszystkich możliwościach.
    static int fibo(int n)
    {
        int[] tab = new int[n + 1];
        tab[1] = 1;
        tab[2] = 1;
        for (int i = 3; i < tab.length; i++)
        {
            tab[i] = tab[i - 1] + tab[i - 2];
        }

        for(int k=1; k<tab.length; k++){
            System.out.print("["+ tab[k] +"]");
        }

        return tab[tab.length - 1];
    }

    static int[] pamiec = new int[ile+1];

    // To zapisuje wszystkie wyniki ale w innych zadaniach nie zawsze to zapisuje wszystkie wyniki.
    static int fib(int n){
        if(n==1 || n==2) pamiec[n]=1;
        if(pamiec[n]==0) pamiec[n] = fib(n-2)+fib(n-1);
        return pamiec[n];
    }

    public static void run(){
//        int count = 1;
//        int progiCount = 0;
//        while(true){
//            if(progiCount==4) break;
//            if(fib(count, new int[count+1]) > progi[progiCount]){
//                System.out.println("Prog " + progi[progiCount] + " krolikow osiagnie w "+count+" dni");
//                progiCount++;
//            }
//            count++;
//        }

        fibo(ile);

//        fib(ile);
//        for(int k=0; k<ile+1; k++){
//            System.out.print(pamiec[k]+" ");
//        }
    }
}
