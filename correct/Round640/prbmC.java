package correct.Round640;
//                        #CORRECT
import java.util.Scanner;

public class prbmC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
            int k = s.nextInt();
//            ArrayList<Integer> array = new ArrayList<>();
//            for (int j = 0; j <k*n ; j++) {
//                array.add(j+1);
//            }
//            for (int j = 0; j <n ; j++) {
//                if (array.get(j)%n == 0){
//                    array.remove(j);
//                }
//            }
//            System.out.println(array.get(k));
            long low = 1;
            long high = 2*k;
//            int mid =0;
            while (low < high){
                long mid = (low+high)/2;
                if (mid-mid/n >=k) high = mid;
                else low = mid+1;
            }
            System.out.println(low);
        }
    }
}
