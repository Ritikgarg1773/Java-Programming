package Algo_practice.course;

import java.math.BigInteger;
import java.util.Scanner;

public class multiply_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String B = s.nextLine();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        a = a.multiply(b);
        System.out.println(a.toString());
    }
}
