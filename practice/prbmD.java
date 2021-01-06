package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class prbmD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s .nextInt();
        BigInteger ans =BigInteger.ZERO;
        for (int i = 1; i < N; i++) {
            BigInteger count = BigInteger.ONE;
            for (int j = 1; j < N; j++) {
                if(i%j==0)count = count.add(BigInteger.ONE);
            }
            count = count.multiply(BigInteger.valueOf(i));
            ans = ans.add(count);
        }
        System.out.println(ans);
    }
}
