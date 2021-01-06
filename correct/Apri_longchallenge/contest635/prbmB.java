package correct.Apri_longchallenge.contest635;

import java.util.Scanner;
//                            #DP problem thats why its giving TLE
public class prbmB {
    public static boolean defeat(int x , int n ,int m){
        if (x <= 0) return true;
        else {
            if (n == 0 && m == 0) return false;
            else if (n == 0 && m > 0) return defeat(x -10, 0 , m-1);
            else if (m == 0 && n> 0)  return defeat(Math.floorDiv(x,2) +10, n-1 , 0);
            else return defeat(x -10, n , m-1) || defeat(Math.floorDiv(x,2) +10, n-1 , m);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int x = s.nextInt();
            int n = s.nextInt();
            int m = s.nextInt();
            boolean flag = defeat(x,n,m);
            if (flag) System.out.println("YES");
            else System.out.println("NO");
//            int a = Math.floorDiv(x + 20, (int) Math.pow(2, n));
        }
    }
}
