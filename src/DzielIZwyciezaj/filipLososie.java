package DzielIZwyciezaj;

public class filipLososie {

    private static final double EULER = Math.exp(0.003);
    private static final int POPULATION = 1_000_000;
    private static int populationDivideAndConquer(int t) { // t - time
        if (t == 0) {
            return POPULATION;
        }
        int population = populationDivideAndConquer(t - 1);
        double permil = population * 0.001;
        return (int) (population * EULER - (4 * permil));
    }

    public static void run(){
        System.out.println(populationDivideAndConquer(7411));
    }
}
