package correct.March_longchallenge;
//                      #correct

import java.util.*;

class codechef {
    public static void main(String[] args) {
//        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N = s.nextInt();   //number of trays
                int M = s.nextInt();   // types of fruits
                int[] F_types = new int[N];
//                int[] Prices = new int[N];
                int[] min_sum = new int[M];
                for (int j = 0; j <N ; j++) {
                    F_types[j] = (s.nextInt());
                }
                for (int j = 0; j <M ; j++) {
                    min_sum[j] = -1;
                }
                for (int j = 0; j <N ; j++) {
                    int now = s.nextInt();
//                    System.out.println(now);
                    if (min_sum[F_types[j]-1] == -1){
                        min_sum[F_types[j]-1] += now+1;
                    }
                    else {
                        min_sum[F_types[j] - 1] += now;
                    }
//                    System.out.println(Arrays.toString(min_sum));
                }
                int mi = 999999;

                for(int j = 0;j<M; j++)
                {
                    if(min_sum[j]<mi && min_sum[j]!=-1)
                    {
                        mi = min_sum[j];
                    }
                }
                System.out.println(mi);
                //cout<<mi<<endl;


//                System.out.println(Arrays.toString(Prices) + "-> prices final");
//                Arrays.sort(min_sum);
//                System.out.println(Arrays.toString(min_sum));

            }
//        }
//        catch (Exception e){
//            return;
//        }
    }
}