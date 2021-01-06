package coursera.week3;

import java.util.Scanner;
import java.util.Vector;

public class coind {
    static int coins[] = {1,5, 10};
    static int n= coins.length;
    private static int getChange(int m) {
        //write your code here
        Vector<Integer> answer = new Vector<>();
        for (int i = n-1; i >=0 ; i--) {
            while (m>= coins[i]){
                m -= coins[i];
                answer.add(coins[i]);
            }
        }
        return answer.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();

        System.out.println(getChange(v));
    }
}
