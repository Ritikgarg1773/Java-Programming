package correct.May_longchallenge;
//                        #Partially correct
import java.io.IOException;
import java.util.*;

public class SORTVS {
    public static int findMinSwapsToSort(int[] ar) {
        int n = ar.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m.put(ar[i], i);
        }
        Arrays.sort(ar);
        for (int i = 0; i < n; i++) {
            ar[i] = m.get(ar[i]);
        }
        m = null;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int val = ar[i];
            if (val < 0) continue;
            while (val != i) {
                int new_val = ar[val];
                ar[val] = -1;
                val = new_val;
                swaps++;
            }
            ar[i] = -1;
        }
        return swaps;
    }
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int N = s.nextInt();
                int M = s.nextInt();
                int[] array = new int[N];
                for (int j = 0; j <N ; j++) {
                    array[j] = s.nextInt();
                }
                HashMap<Integer,ArrayList<Integer>> M_values = new HashMap<>();
//                for (int j = 0; j <M ; j++) {
//                    M_values.put(0,r);
//                }
                for (int j = 0; j <M ; j++) {
                    int a = s.nextInt();
                    int b= s.nextInt();
                    ArrayList<Integer> r = new ArrayList<>();
                    r.add(b);
                    M_values.put(a,r);
                }
                int q = ((N-1)*N)/2;
                if (M>=q) System.out.println(0);
                else {
                    System.out.println(findMinSwapsToSort(array));
                }
            }
        }
        catch (Exception e){
            return;
        }
    }
}
