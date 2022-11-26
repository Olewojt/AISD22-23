public class plecakDZ {
    final static int N = 6;                // liczba przedmiotow
    final static int MAX_V = 10;           // objetosc plecaka

    final static int[] V = {6,2,3,2,3,1};  // objetosci przedmiotow
    final static int[] W = {6,4,5,7,10,2}; // wartosci przedmiotow

    //                 { 0                                              i=0 i v<Vo
    //                 { Wo                                             i=0 i v>=Vo
    // plecak(i,v) =   { plecak(i-1,v)                                  i>0 i v<Vi
    //                 { max( plecak(i-1,v), Wi + plecak(i-1, v-Vi) )   i>0 i v<Vi
    //

    static int plecak(int i, int v){
        if(i==0 && v<V[0]) return 0;
        if(i==0 && v>=V[0]) return W[0];

        if(i>0 && v<V[i]){
            return plecak(i-1, v);
        }

        if(plecak(i-1, v) > W[i]+plecak(i-1, v-V[i])) return plecak(i-1,v);
        else return W[i]+plecak(i-1,v-V[i]);

        // dobry jezu ale po****ne
    }

    public static void run(){
        System.out.println("Wartosc plecaka: " + plecak(N-1, MAX_V));
    }
}
