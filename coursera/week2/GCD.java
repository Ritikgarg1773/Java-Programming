package coursera.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GCD {
    public static int GCDNaive(int a, int b){
        // big time complexity
        int best = 0;
        for (int i = 1; i <=a+b ; i++) {
            if (a%i == 0 && b%i==0){
                best = i;
            }
        }
        return best;
    }
    public static int factors(int a, int b){
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i*i < a ; i++) {
            if (a % i == 0){
                A.add(i);A.add(a/i);
            }
        }
        Collections.sort(A);
//        System.out.println(Arrays.toString(A.toArray()));
        int answer = 0;
        int i = A.size()-1;
        while (i> 0){
//            System.out.print(A.get(i) + " ");
            answer = EuclidGCD(A.get(i--), b);
//            System.out.println(answer);
            if (answer == 1){
                return A.get(i+1);
            }
        }
        return 1;
    }
    public static int EuclidGCD(int a, int b){
        // it takes lob(ab) steps to compute the GCD
        // this algorithm takes more space complexity
        if (b == 0){
            return a;
        }
        int i = a%b;
        return EuclidGCD(b,i);
    }

//    private static int EuclidGCD(int a, int b) {
//        if (b == 0){
//            return a;
//        }
//        int i = a%b;
//        return EuclidGCD(b,i);
//    }
//    private static long lcm_naive(int a, int b) {
//        int gcd = EuclidGCD(a,b);
////        System.out.println(gcd);
//        long product = (long)a*b;
//        long lcm = product / gcd;
//        return lcm;
//    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(factors(a, b));
    }
}
