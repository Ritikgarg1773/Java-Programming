package correct.March_longchallenge.codeforces;
//                    #CORRECT
import java.util.Scanner;

public class prbm476A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m =s.nextInt();
        int k;
        int counter=0;
        if (n%2 == 0){
            k = n/2;
            for (int i = k; i <=2*k ; i++) {
                if (i%m == 0){
                    counter = i;
                    break;
                }
            }}
        else{
            k = (n/2)+1;
            for (int i = k; i <=2*k-1 ; i++) {
                if (i%m == 0){
                    counter = i;
                    break;
                }
            }}

        if (counter > 0){
            System.out.println(counter);
        }
        else System.out.println(-1);
    }
}
