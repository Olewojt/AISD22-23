package DzielIZwyciezaj;

public class krolikiDZ {
//    Fib(n) = { 1 dla n=1
//             { 1 dla n=2
//             { Fib(n-1)+Fib(n-2) dla n>2

    static int fib(int a){
        if(a==1 || a==2) return 1;
        else return fib(a-1)+fib(a-2);
    }

    public static void run(){
        System.out.println(fib(10));
    }
}
