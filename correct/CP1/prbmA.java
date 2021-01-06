package correct.CP1;

import java.util.Scanner;

public class prbmA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] array = new int[n];
            int count = 0;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                array[j] = s.nextInt();
                if(array[j]>max)max = array[j];
            }
            max = 100-max;
            for (int j = 0; j <n ; j++) {
                array[j]+=max;
                if(array[j]>=50)count++;
            }
            System.out.println(count);
        }
    }
}
