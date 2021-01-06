package Algo_practice;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] array =  new int[T];
        int x = s.nextInt();
        int flag =0;
        for (int i = 0; i <T ; i++) {
            array[i] = s.nextInt();
            if (array[i] == x){
                flag = 1;
            }
        }
        if (flag == 1){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }

    }
}
