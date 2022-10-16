public class zaloga {

    public static void run(){
        int k1,k2,k3,k4,k5;

        int crew[][] = {
                {1,0,0,1}, // A B C D
                {0,1,0,1},
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1},
        };

        int status[] = new int[4];
        int res[] = new int[5];

        int resetRes[] = new int[5];
        int resetStatus[] = new int[4];

        for(k1=0; k1<=1; k1++)
            for(k2=0; k2<=1; k2++)
                for(k3=0; k3<=1; k3++)
                    for(k4=0; k4<=1; k4++)
                        for(k5=0; k5<=1; k5++){
                            if(k1==1){
                                res[0] = 1;
                                status[0] = 1;
                                status[3] = 1;
                            }

                            if(k2==1){
                                res[1] = 1;
                                status[1] = 1;
                                status[3] = 1;
                            }

                            if(k3==1){
                                res[2] = 1;
                                status[1] = 1;
                                status[2] = 1;
                            }

                            if(k4==1){
                                res[3] = 1;
                                status[0] = 1;
                                status[1] = 1;
                            }

                            if(k5==1){
                                res[4] = 1;
                                status[2] = 1;
                                status[3] = 1;
                            }
                            if(status[0]==1 && status[1]==1 && status[2]==1 && status[3]==1){
                                System.out.print("[");
                                for(int g=0; g<5; g++) if(res[g]==1) System.out.printf("k%d ", g+1);
                                System.out.println("]");
                                res = resetRes.clone();
                                status = resetStatus.clone();
                            }
                        }
    }
}
