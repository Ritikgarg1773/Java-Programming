package com.company.AugustLongChallenge;
//                    #CORRECT
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LINCHESS {
    public static void main(String[] args) throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int N = s.nextInt();
                int K = s.nextInt();
                int[] array = new int[N];
                for (int j = 0; j < N; j++) {
                    array[j] = s.nextInt();
                }
                int min = Integer.MAX_VALUE;
                int index = -1;
                int[] moves = new int[N];
                for (int j = 0; j < N; j++) {
                    if (array[j] > K) {
                        moves[j] = Integer.MAX_VALUE;

                    } else if (array[j] == K) {
                        index = array[j];
                        break;
                    } else {
                        if(K%array[j]==0) {
                            moves[j] = K / array[j];
                            if (min > moves[j]) {
                                min = moves[j];
                                index = array[j];
                            }
                        }
                    }
//                    System.out.println(Arrays.toString(moves));
                }
                System.out.println(index);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
