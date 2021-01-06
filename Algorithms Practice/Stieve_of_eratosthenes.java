package Algo_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class
Stieve_of_eratosthenes {
    public static void sieve(int n){
        //Here we are going to print all primes less than n
        // its time complexity is O(n*log(log(n)))
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
//        for (int i = 0; i <n+1 ; i++) {
//            prime[i] = true;
//        }
        for (int i = 2; i*i <n+1 ; i++) {
            if (prime[i]){
                for (int j = i*i; j <n+1 ; j+=i) {
                    prime[j] = false;
                }
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        Object[] a1 = a.toArray();
        for (int i = 2; i <n ; i++) {
            if (prime[i]) {
                System.out.println(i+" ");
                a.add(i);
            }
        }
    }
    
}
