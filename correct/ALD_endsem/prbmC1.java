package correct.ALD_endsem;

import java.util.Arrays;
import java.util.Scanner;

public class prbmC1 {
    static long tC2(long n){
        return  (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        long[] array = new long[S.length()];
        array[0] = 0;
        for (int i = 1; i <S.length() ; i++) {
            if (S.charAt(i-1)!= S.charAt(i)) {
                array[i] += array[i-1] + 1;
            }
            else array[i] = array[i-1];
        }
        System.out.println(Arrays.toString(array));
        long[] array1 = new long[S.length()];
        array1[0] = 0;
        for (int i = 1; i <S.length()-1 ; i++) {
            if (S.charAt(i-1)!= S.charAt(i+1)) {
                array1[i] += array1[i-1] + 1;
            }
            else array1[i] = array1[i-1];
        }
        long max = 0;
        for (int i = 0; i <array1.length ; i++) {
            if (max < array1[i] )max = array1[i];
        }
//        System.out.println(Arrays.toString(array));//        System.out.println(Arrays.toString(output.toArray()));
        System.out.println(Arrays.toString(array1));//        System.out.println(Arrays.toString(output.toArray()));
        System.out.println(max);
        long sum1 = array[array.length-1] + max;
////        System.out.println(sum);
//        sum+= tC2(output.size());
//        System.out.println(sum);
    }
}
