package correct.abc171;
//                        #CORRECT
import java.util.Arrays;
import java.util.Scanner;

public class prbmB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < k; i++) {
            count+=arr[i];
        }
        System.out.println(count);
    }
}
