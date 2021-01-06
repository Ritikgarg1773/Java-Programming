package correct.March_longchallenge.miscelleaneous;
//                        #CORRECT
import java.util.Scanner;

import static java.lang.System.exit;

public class prbm1323_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        String a = s.nextLine();
        int left_bracket = 0;
        int right_bracket = 0;
        int counter=0;
        if (t%2 == 1){
            System.out.println(-1);
            exit(0);
        }
        for (int i = 0; i <t ; i++) {
            if (a.charAt(i) == '('){
                right_bracket++;
            }
            else left_bracket++;
        }
        if (left_bracket != right_bracket){
            System.out.println(-1);
        }
        else {
            left_bracket = 0;
            right_bracket =0;
            for (int i = 0; i <t ; i++) {
                if (a.charAt(i) == ')'){
                    left_bracket++;
                    if (left_bracket == right_bracket){
                        left_bracket = 0;
                        right_bracket = 0;
                    }
                }
                else {
                    right_bracket++;
                    if (left_bracket == right_bracket){
                        counter += 2*right_bracket;
                        left_bracket = 0;
                        right_bracket = 0;
                    }
//                    System.out.println(left_bracket + " " + right_bracket);
                }
            }
            System.out.println(counter);
        }
    }
}
