import java.util.Scanner;

public class wydawanieReszty {

    static double[] nominaly = {5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    static int ile = nominaly.length;
    static int[] ileMonet = new int[ile]; // Ilosc wyliczonych monet

    static void wypisz(){
        for(int i=0; i<ile; i++){
            System.out.printf("Ilosc %.2fzl = %d\n", nominaly[i], ileMonet[i]);
        }
    }
    static void sprawdzaj(double kwota, double[] monety){
        int count=0;
        while(true){
            if(kwota==0) break;
            if(count==ile){
                System.out.println("Brak monet do wyplaty reszty!");
                break;
            }
            if(kwota-nominaly[count]>=0 && monety[count]>0) {
                kwota -= nominaly[count];
                monety[count]--;
                ileMonet[count]++;
            }else{
                count++;
            }
        }
    }
    static double zapytaj(){
        Scanner in = new Scanner(System.in);
        System.out.print("Ile zlotowek: ");
        float zlotowki = in.nextFloat();
        System.out.print("Ile groszy: ");
        float grosze = in.nextFloat();

        double kwota = zlotowki + (grosze/100);
        return kwota;
    }
    public static void run(){
        double kwota = zapytaj();
        double monetyAutomat[] = {2, 1, 0, 0, 0, 0, 0, 0, 0}; // 9 elementowy zbior, ilosc monet w automacie

        System.out.printf("Kwota: %.2fzl\n", kwota);
        sprawdzaj(kwota, monetyAutomat);
        wypisz();
    }
}
