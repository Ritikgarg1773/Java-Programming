package com.company.AugustLongChallenge;

import java.io.IOException;
import java.util.Scanner;

public class CRDGAME3 {
    public static void main(String[] args)throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int Pc = s.nextInt();
                int Pr = s.nextInt();
                int count1 = countDigit(Pc);
                int count2 = countDigit(Pr);
                if(count1==count2){
                    System.out.println(1 +" " +count1);
                }
                else if(count1>count2){
                    System.out.println(1 + " " + count2);
                }
                else System.out.println(0 +" " + count1);
            }
        }
        catch (Exception e){
            return;
        }
    }

    private static int countDigit(int n) {
        int count=0;
        if(n%9==0){
            count=n/9;
        }
        else count = (n/9)+1;
        return count;
    }
}
