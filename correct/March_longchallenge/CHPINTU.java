package correct.March_longchallenge;
//                          #incorrect
import java.util.*;

public class CHPINTU {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N = s.nextInt();   //number of trays
                int M = s.nextInt();   // types of fruits
                int[] F_types = new int[N];
                int[] Prices = new int[N];
                int[] min_sum = new int[M];
                for (int j = 0; j <N ; j++) {
                    F_types[j] = (s.nextInt());
                }
                for (int j = 0; j <N ; j++) {
                    Prices[j] = s.nextInt();
                }
                for (int j = 0; j <M ; j++) {
                    min_sum[j] = -1;
                }
                for (int j = 0; j <N ; j++) {
//                    int counter = 0;
                    int a = F_types[j];   //picked up the type of fruit
//                    System.out.println(a);
                    if (a >= 0) {
                        for (int k = j+1; k < N; k++) {  // from j+1 to last count the get the fruit of same type
                            if (F_types[k] == a) {
                                Prices[j] += Prices[k];
                                Prices[k] = -1;
                                F_types[k] = -1;
//                            k--;
//                                System.out.println(Arrays.toString(F_types));
//                                System.out.println(Arrays.toString(Prices) + "-> prices");
                            }
                        }
                        min_sum[a-1] = Prices[j];
                    }
//                    System.out.println(Arrays.toString(min_sum));
                }
//                System.out.println(Arrays.toString(Prices) + "-> prices final");
//                Arrays.sort(min_sum);
//                System.out.println(Arrays.toString(min_sum));
                int min = min_sum[0];
//                if (min ==0){
//                    min = min_sum[1];
//                }
                for (int j = 0; j <M ; j++) {
                    if (min_sum[j] != -1){
                        if (min > min_sum[j])
                            min = min_sum[j];
                    }
                }
                System.out.println(min);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
