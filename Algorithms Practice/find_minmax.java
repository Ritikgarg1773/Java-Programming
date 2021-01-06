package Algo_practice.course;

import java.util.Scanner;

public class find_minmax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        if (A>B && A > C){
            if (B>C) System.out.println(B);
            else System.out.println(C);
        }
        else if (B>A && B>C ){
            if (A>C) System.out.println(A);
            else System.out.println(C);
        }
        else {
            if (A>B) System.out.println(A);
            else System.out.println(B);
        }
    }
}
