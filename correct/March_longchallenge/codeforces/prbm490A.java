package correct.March_longchallenge.codeforces;
//                    #CORRECt
import java.util.ArrayList;
import java.util.Scanner;

public class prbm490A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        ArrayList c = new ArrayList();
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
            if (n == 1){
                a.add(i+1);
            }
            else if (n == 2){
                b.add(i+1);
            }
            else c.add(i+1);
        }
        System.out.println(Math.min(a.size(),Math.min(b.size(),c.size())));
        for (int i = 0; i <Math.min(a.size(),Math.min(b.size(),c.size())) ; i++) {
            System.out.println(a.get(i) +" " + b.get(i) +" " + c.get(i));
        }
    }
}
