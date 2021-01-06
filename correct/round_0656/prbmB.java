package correct.round_0656;
//                    #CORRECT
import java.util.HashSet;
import java.util.Scanner;

public class prbmB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j <2*n ; j++) {
                int a = s.nextInt();
                if(set.contains(a)){
                    continue;
                }
                else{
                    set.add(a);
                    System.out.print(a+" ");
                }
            }
//            for (int j : set) {
//                System.out.print(j + " ");
//            }
            System.out.println();
        }
    }
}
