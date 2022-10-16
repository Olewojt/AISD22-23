public class ProblemZalogiKosmicznej {

    public static void run(){

        int crew[][] = {
                {1,0,0,1}, // A B C D
                {0,1,0,1},
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1},
        };
        boolean status[]={false, false, false, false};
        boolean fal[] = {false, false, false, false};
        int res[] = new int[5];
        int zero[] = new int[5];

        for(int k=0; k<5; k++){
            for(int s=0; s<5; s++){
                res[k] = 1;
                // Wypelniam kompetencje aktualnie sprawdzanego astronauty
                for(int j=0; j<4; j++){
                    if(crew[k][j]==1) status[j]=true;
                }
                for(int l=0; l<4; l++){

                    if(crew[s][l] == 1){
                        status[l] = true;
                        res[s] = 1;
                    }

                    if(status[0] && status[1] && status[2] && status[3]){
                        for(int g=0; g<5; g++){
                            if(res[g] == 1) System.out.printf("k%d, ", g+1);
                        }
                        System.out.println();
                        status = fal.clone();
                        res = zero.clone(); // Wypelniam rezultat zerami
                    }
                }
            }
            status = fal.clone();
        }

    }

    public static void run1(){
        int crew[][] = {
                {1,0,0,1}, // A B C D
                {0,1,0,1},
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1},
        };

        int status[] = new int[4];
        int res[] = new int[5];

        int reset[] = new int[5];
        int resetStatus[] = new int[4];

        for(int k=0; k<5; k++){
            res[k] = 1;

            for(int s=0; s<5; s++){
                // Wypelnianie kompetencji
                for(int h=0; h<4; h++)  if(crew[s][h]==1) status[h]=1;

                res[s]=1;
//                System.out.printf("[%d,%d,%d,%d,%d]  %d\n", res[0], res[1], res[2], res[3], res[4], s);
//                System.out.printf("[%d,%d,%d,%d]\n", status[0], status[1], status[2], status[3]);
                if(status[0]==1 & status[1]==1 & status[2]==1 & status[3]==1){
                    System.out.print("[");
                    for(int g=0; g<5; g++) System.out.printf("%d,", res[g]);
                    System.out.println("]");
                    status = resetStatus.clone();
                }
            }
            res = reset.clone();
            status = resetStatus.clone();
        }
    }
}
