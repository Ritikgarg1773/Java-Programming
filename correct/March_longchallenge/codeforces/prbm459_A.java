package correct.March_longchallenge.codeforces;
//                        #CORRECT
import java.util.Scanner;

public class prbm459_A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x0 = s.nextInt();
        int y0 = s.nextInt();
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int l1 = Math.abs(x0-x1);
        int l2 = Math.abs(y0-y1);

        if(l1 == 0){
            if (l2 == 0){
                System.out.println(-1);
            }
            else{
                System.out.println((x0+l2) + " " + (y0) + " " + (x1+l2) + " " + (y1) );
            }
        }
        else if (l2 == 0){
            if (l1 == 0){
                System.out.println(-1);
            }
            else {
                System.out.println((x0)+ " " + (y0 + l1) + " " + (x1) + " " + (y1 + l1) );
            }
        }
        else if (l1 == l2){
            System.out.println(x0 + " " + y1 + " " + x1 + " " + y0) ;
        }
        else System.out.println(-1);
    }
}
