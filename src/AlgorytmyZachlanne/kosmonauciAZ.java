package AlgorytmyZachlanne;

import java.util.ArrayList;

public class kosmonauciAZ {
    public static void run()
    {
                                //  A        B        C         D
        int[][] astroSkills = {{1, 4}, {2, 3, 4}, {3, 5}, {1, 2, 5}};
        int[] astro = {1, 2, 3, 4, 5};

        int ind = 0; // zaczynamy od astro[0] i 'pakujemy' na poklad wg kolejnosci astro
        ArrayList<Integer> onBoard = new ArrayList<Integer>();
        while(true)
        {
            if(ind == astro.length) // zabezpieczenie gdyby ktoras z dziedzin pozostala nieobsadzona pomimo analizy wszystkich astro
                break;
            System.out.println("Analizowany astro: "+astro[ind]);

            int skill = 0;
            for(int i = 0; i < astroSkills.length; i++) // licz specjalnosci astronauty
            {
                for(int j = 0; j < astroSkills[i].length; j++)
                {
                    if(astro[ind] == astroSkills[i][j])
                        skill++;
                }
            }
            System.out.println("\tastro_"+astro[ind]+" : "+skill+" spec");

            if(skill >= 1) // jesli obsadza min 1 spec to wez na poklad
            {
                onBoard.add(astro[ind]);
                System.out.println("\tna pokladzie: " + onBoard.toString());
            }
            else
            {
                ind++;
                continue;
            }

            int match = 0; // licznik obsadzonych dziedzin
            for(int i = 0; i < astroSkills.length; i++) // spr dziedziny czy obsadzone przez min 1 astro
            {
                for(int j = 0; j < astroSkills[i].length; j++) // analiza specjalistow z danej dziedziny
                {
                    if(onBoard.contains(astroSkills[i][j])) // jesli dany astro obsadza dziedzine ...
                    {
                        match++; // ... zaznacz, ze dziedzina obsadzona ...
                        break; // .. nie licz kolejnego astro z tej dziedziny = przejdz do spr kolejnej dziedziny
                    }
                }
            }
            System.out.println("\tobsadzonych dziedzin: "+match);

            if(match == astroSkills.length) // czy wszystkie specjalnosci obsadzone
                break;
            ind++; // kolejny astronauta
        }
        if(ind == astro.length)
            System.out.println("Brak rozwiazania!");
        else
            System.out.println("Moga leciec kosmonauci: " + onBoard.toString());
    }
}
