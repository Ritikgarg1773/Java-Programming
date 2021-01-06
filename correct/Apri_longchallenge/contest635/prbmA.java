package correct.Apri_longchallenge.contest635;
//                    #COREECT
import java.util.Scanner;

public class prbmA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i <T ; i++) {
            long a = s.nextLong();
            long b = s.nextLong();
            long c = s.nextLong();
            long d = s.nextLong();
            if ( b +c > d) System.out.println(b +" " + c + " " + d);
            else {
                System.out.println(b +" " + c + " " + c);
            }
        }
    }
}
