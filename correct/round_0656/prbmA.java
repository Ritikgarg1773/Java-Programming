package correct.round_0656;
//                #CORRECT
import java.util.Scanner;

public class prbmA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            if (x == y) {
                if (x >= z) {
                    System.out.println("YES");
                    System.out.println(x + " " + z + " " + z);
                } else System.out.println("NO");
            } else if (x == z) {
                if (x >= y) {
                    System.out.println("YES");
                    System.out.println(y + " " + z + " " + y);
                } else System.out.println("NO");
            } else if (y == z) {
                if (y >= x) {
                    System.out.println("YES");
                    System.out.println(x + " " + x + " " + y);
                } else System.out.println("NO");
            }
            else System.out.println("NO");
        }
    }
}
