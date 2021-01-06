package correct.March_longchallenge.codeforces;
//                        #CORRECT
import java.util.ArrayList;
import java.util.Scanner;

public class prbm432_A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int a = s.nextInt();
            if (a+k<= 5){
                arrayList.add(a);
            }
        }
        System.out.println(arrayList.size()/3);
    }
}
