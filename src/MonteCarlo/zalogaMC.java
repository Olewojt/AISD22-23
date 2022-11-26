import java.util.Random;

public class zalogaMC {
    static int zaloganci = 5;
    static int ileKwal = 4;

    static int[][] skills = {
            {1,0,0,1},
            {0,1,0,1},
            {0,1,1,0},
            {1,1,0,0},
            {0,0,1,1},
    }; //    A B C D

    static boolean[] kwalifikacje = new boolean[ileKwal];
    static boolean[] zaloga = new boolean[zaloganci];
}
