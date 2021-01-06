package coursera.week2;

import java.util.*;
//import java.util.Scanner;

public class fibo {

    public static int fibo_recursive(int n){
        // T(n) = T(n-1) + T(n-2) + 3;
        // big time complexity
        if (n<=1){
            return n;
        }
        return fibo_recursive(n-1) + fibo_recursive(n-2);
    }

    private static long getFibonacciHugeNaive(long n, long m) {
        List<Integer> modulos = new ArrayList<>();
        modulos.add(0);
        modulos.add(1);
        int i = 0;
        // must check both current and next modular
        while(! (i > 0 && modulos.get(i) == 0 && modulos.get(i + 1) == 1)) {
            modulos.add((int) ((
                    modulos.get(  i  ) % m +
                            modulos.get(i + 1) % m ) % m));
            i++;
        }
        return modulos.get((int) (n % i));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
    static int[] fibo_array = new int[10000+1];
    public static int fibo_memoized(int n){

        if (n<=1){
            return n;
        }
        if (fibo_array[n] != -1){
            return fibo_array[n];
        }
        fibo_array[n] = fibo_array[n-1] + fibo_array[n-2];
        return fibo_array[n];
    }

//    static long get_pisano_period( long m) {
//        long a = 0, b = 1, c = a + b;
//        for (int i = 0; i < m * m; i++) {
//            c = (a + b) % m;
//            a = b;
//            b = c;
//            if (a == 0 && b == 1) return i + 1;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        System.out.println(calc_fib(n));
//    }
}
