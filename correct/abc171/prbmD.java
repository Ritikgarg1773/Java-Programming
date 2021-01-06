package correct.abc171;
//                        #CORRECT
import java.util.Scanner;

public class prbmD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] arr = new long[110000];
        long sum = 0;
        for(int i =0;i<n;i++){
            long a = s.nextLong();
            arr[(int)a-1]++;
            sum+=a;
        }
//        System.out.println(Arrays.toString(arr));
        int q = s.nextInt();
        for(int i = 0;i<q;i++){
            long t = s.nextLong();
            long k =s.nextLong();
            long v1 = arr[(int)t-1];
//            int v2 = arr[k];
            arr[(int)t-1] = 0;
            arr[(int)k-1] += v1;
//            System.out.println(Arrays.toString(arr));
            sum += v1 * (k-t);
            System.out.println(sum);
        }
    }
}
