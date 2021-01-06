package correct.March_longchallenge.miscelleaneous;
//                        #CORRECT
import java.util.Scanner;

public class Ordering_food {
    public static int number_of_ones(int a){
        String a1 = Integer.toBinaryString(a);
        int counter = 0;
        for (int i = 0; i <a1.length() ; i++) {
            if (a1.charAt(i) == '1'){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i <T ; i++) {
            int a = s.nextInt();
            if (a <= 2048){
                System.out.println(number_of_ones(a));
            }
            else {
                int t = a / 2048;
                t+= number_of_ones(a%2048);
                System.out.println(t);
            }
        }
    }
}
