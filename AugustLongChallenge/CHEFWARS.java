package com.company.AugustLongChallenge;
//                    #CORRECT
import java.io.IOException;
import java.util.Scanner;

public class CHEFWARS {
    public static void main(String[] args) throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int H = s.nextInt();
                int P = s.nextInt();
                while(true){
                    H -=P;
                    P = (int)(Math.ceil(P/2));
//                    System.out.println(H +" "+P);
                    if(H<=0)break;
                    if(P<=0)break;
                }
                if(H<=0 && P>=0) System.out.println(1);
                else System.out.println(0);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
