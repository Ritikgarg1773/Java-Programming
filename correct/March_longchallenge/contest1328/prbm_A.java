package correct.March_longchallenge.contest1328;
//                #CORRECT
import java.util.Scanner;

public class prbm_A {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();
        for (int i = 0; i < T; i++) {
            int a = S.nextInt();
            int b= S.nextInt();
            if (a>b){
                if (a%b ==0){
                    System.out.println(0);
                }
                else
                System.out.println(b - a%b);
            }
            else System.out.println(b-a);
        }
    }
}
