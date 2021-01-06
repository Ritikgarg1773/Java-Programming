package correct.March_longchallenge.codeforces;
//                    #CORRECT
import java.util.Scanner;

public class prbm510_A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        String[][] array = new String[r][c];
        int f = 1;
        int g = 3;
        for (int i = 0; i <r ; i++) {
            if (i%2 == 0){
                for (int j = 0; j <c ; j++) {
                    array[i][j] = "#";
                }
            }
            else {
                for (int j = 0; j <c ; j++) {
                    array[i][j] = ".";
                }
                if (i == f){
                    array[i][c-1] = "#";
                    f+=4;
                }
                else if (i == g){
                    array[i][0] = "#";
                    g+=4;

                }

            }
            //1 , 5, 9 .. -> a[i][c] = "#"
//             3,7,1 .....-> array[i][0] ="#"
        }
//        for (int i = 1; i <r ; i+= 3) {
//            array[i][c] = "#";
//        }
//        for (int i = 3; i <r ; i+=3) {
//            array[i][0] = "#";
//        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
