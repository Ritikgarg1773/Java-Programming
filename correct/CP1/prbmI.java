package correct.CP1;
//                        #CORECT
import java.util.*;

public class prbmI {
    static HashSet<Integer> array = new HashSet<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int j = 0; j < 1000; j++){
            for(int k = 0;k<=j;k++){
//                System.out.println(j + " " + k + " -> "+ ((j*j) + (k*k)));
                array.add((j*j) + (k*k));
            }
        }
        ArrayList<Integer> arr = new ArrayList<>(array);
        Collections.sort(arr);
//        System.out.println(arr);
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
//            if(n<array.size()) System.out.println(array.get(n));

            System.out.println(arr.get(n-1));
        }
    }
}
