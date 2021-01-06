package Interview_bit;
//                        #CORRECT
import java.math.BigInteger;
import java.util.Scanner;

public class Add_binnarystring {
    public static String addBinary(String A, String B) {
        BigInteger a = new BigInteger(A,2);
        BigInteger b = new BigInteger(B,2);
        a = a.add(b);
        String c = a.toString(2);
//        System.out.println();
//        long sum = Long.parseLong(A,2) + Long.parseLong(B,2);
//         System.out.println(sum);
        // System.out.println();
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String B = s.nextLine();
        System.out.println(addBinary(A,B));
    }

}
