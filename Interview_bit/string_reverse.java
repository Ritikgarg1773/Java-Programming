package Interview_bit;

import java.util.Arrays;
import java.util.Scanner;

public class string_reverse {
    public static String solve(String A) {
        String[] array = A.split(" ");
        System.out.println(Arrays.toString(array));
        String s1= "";
        for (int i = 0; i <array.length ; i++) {
//            StringBuilder s = new StringBuilder(array[i]);
//            s = s.reverse();
            s1 = array[i] +" " + s1;
        }
//        s= s.reverse();
        StringBuilder s = new StringBuilder(s1);
        s.deleteCharAt(s.length()-1);
        System.out.println(s1);
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        solve(a);
    }
}
