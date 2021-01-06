package correct.June_longchallenge;
//                #CORRECT
import java.io.IOException;
import java.util.Scanner;

public class PRICECON {
    public static void main(String[] args)throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int n = s.nextInt();
                int k = s.nextInt();
                int[] array = new int[n];
                long sum =0;
                for (int j = 0; j <n ; j++) {
                    array[j] = s.nextInt();
                    if (array[j] > k){
                        sum+=array[j] - k;
                    }
                }
                System.out.println(sum);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
