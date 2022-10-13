public class ProblemPlecakowy {
    public static void run() {
        System.out.println("Problem Plecakowy!");

        int tab[][] = {
                {6, 6},
                {2, 4},
                {3, 5},
                {2, 7},
                {3, 10},
                {1, 2}
        };

        int v; // Objetosc
        int value = 0; // Wartosc
        int max=0;
        int result[] = new int[6];

        for (int i = 0; i < 6; i++) {
            v = tab[i][0];
            value = tab[i][1];
            for (int k=i+1; k < 6; k++) {
                if (v + tab[k][0] <= 10) {
                    v += tab[k][0];
                    value += tab[k][1];
                    if(value>=max) result[k] = k;
                }
            }
//            System.out.printf("V: %d \n" +
//                    "Value: %d \n\n", v, value);
        }
        for(int l=0; l<6; l++) System.out.print(result[l] + ", ");
    }


//        int val=0;
//        int temp=0;
//        int max=0;


//        for(int i=0; i<6; i++){
//            temp = tab[i][0];
//            for(int k=1; k<5; k++) {
//                if (temp + tab[k+1][0] <= 10) {
//                    System.out.printf("Temp: %d \ntab[k+1][0]: %d\n\n", temp, tab[k+1][0]);
//                    val += tab[k][1];
//                    temp += tab[k+1][0];
//                }
//            }
//            System.out.printf("Val: %d \nTemp: %d \n\n", val, temp);
//            val=0;
//            temp=0;
//        }
}
