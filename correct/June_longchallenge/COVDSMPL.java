package correct.June_longchallenge;
//                        #CORRECT -> SCORE - 0.079 Needs Improvisation
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class COVDSMPL {
    public static void main(String[] args)throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N = s.nextInt();
                int P = s.nextInt();
                int[][] array = new int[N][N];
//            int r1=0,r2=0;
//            System.out.println();
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        System.out.println(1 + " " + (j + 1) + " " + (k + 1) + " " + (j + 1) + " " + (k + 1) + " ");
                        int number = s.nextInt();
//                    System.out.println(number);
                        if (number == 1) {
                            array[j][k] = 1;
                        }
//                    else array[i][j] = 0;
                    }
                }
                System.out.println(2);
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        System.out.print(array[j][k] + " ");
                    }
                    System.out.println();
                }
                int X = s.nextInt();
                if (X == -1) {
                    exit(0);
                }
            }
        }
        catch (Exception e){
            return;
        }
    }

}
