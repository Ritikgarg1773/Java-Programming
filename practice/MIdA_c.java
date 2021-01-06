package practice;

import java.util.Scanner;

public class MIdA_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double t= s.nextDouble();
        double[] arr = new double[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextDouble();
        }
        double ans = 0;
        for (int i = 0; i <n ; i++) {
            ans += 1/(arr[i]);
        }
//        System.out.println(ans);
        ans = Math.ceil(t/ans);
        System.out.println((long)ans);
    }
}
