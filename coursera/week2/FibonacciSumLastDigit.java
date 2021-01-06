package coursera.week2;

import java.util.*;

public class FibonacciSumLastDigit {
    static void fib(int f[])
    {
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= 59; i++)
            f[i] = (f[i - 1] + f[i - 2]) % 10;

    }

    static int findLastDigit(long n)
    {
        int f[] = new int[60];

        fib(f);
//        System.out.println(Arrays.toString(f));
        int index = (int)(n % 60L);
//        System.out.println(index + " " + f[index]);
        if (f[index] == 0) return 10;
        else return f[index];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        long from = scanner.nextLong();
//        long to = scanner.nextLong();
//        int fr = findLastDigit(from+1)-1;
//        int t = findLastDigit(to+2)-1;
////        System.out.println(fr +" " + t);
//        if (t - fr>= 0) System.out.println(t - fr);
//        else System.out.println(t + 10 - fr);

        long n = scanner.nextLong();
        long s = findLastDigit(n);
        long s1 = findLastDigit(n+1);
        System.out.println((s*s1)%10);
    }
}
