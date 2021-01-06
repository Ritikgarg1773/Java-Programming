package correct.JulyLongChallenge;
//                        #CORRECT
import java.io.IOException;
import java.util.Scanner;

public class CHEFSTR1 {
    public static void main(String[] args)throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T =s.nextInt();
            for (int i = 0; i <T ; i++) {
                int n = s.nextInt();
                int[] array = new int[n];
                for (int j = 0; j < n; j++) {
                    int a = s.nextInt();
                    array[j] = a;
                }
                long sum = 0;
                for (int j = 1; j < n; j++) {
//                    System.out.println(array[j] +" " + array[j-1]+" " +(Math.abs(array[j] - array[j-1])-1));
                    sum += Math.abs(array[j] - array[j-1]) -1;
                }
                System.out.println(sum);
            }

        }
        catch (Exception e) {
            return;
        }
    }
}
