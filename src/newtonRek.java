public class newtonRek {

    static int newton(int k, int n){
        if(k==0 || k==n) return 1;
        else return newton(k-1, n-1)+newton(k,n-1);
    }

    public static void run(){
        System.out.println(newton(5,10)); // 252
    }
}
