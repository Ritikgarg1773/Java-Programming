package correct.March_longchallenge.miscelleaneous;
//                                      #CORRECT
import java.util.Arrays;
import java.util.Scanner;

public class SMPAIR {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int N = s.nextInt();
                int[] arr = new int[N];
                for (int j = 0; j <N ; j++) {
                    arr[j] = s.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(arr[0] + arr[1]);
            }
        }catch (Exception e){
            return;
        }
    }
}
