package correct.March_longchallenge.miscelleaneous;
//                        #CORRECT
import java.io.IOException;
import java.util.Scanner;

public class LECANDY {
    public static void main(String[] args)throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N = s.nextInt();
                int[] array = new int[N];
                int k = s.nextInt();
                int sum = 0;
                for (int j = 0; j <N ; j++) {
                    array[j] = s.nextInt();
                    sum+=array[j];
                }
                if (sum<= k){
                    System.out.println("Yes");
                }
                else System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}
