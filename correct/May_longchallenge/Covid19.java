package correct.May_longchallenge;
//                    #CORRECT
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Covid19 {
    public static void main(String[] args) throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N = s.nextInt();
                int[] array = new int[N];
                for (int j = 0; j < N; j++) {
                    array[j] = s.nextInt();
                }
                int[] count_array = new int[N - 1];
                for (int j = 0; j < N - 1; j++) {
                    count_array[j] = array[j + 1] - array[j];
                }
//                System.out.println(Arrays.toString(count_array));
                int max = 1;
                int min = 1;
                int count = 1;
                ArrayList<Integer> all_poss = new ArrayList<>();
                for (int j = 0; j < N - 1; j++) {
                    if (count_array[j] <= 2) {
                        count++;
//                    System.out.println(count);
                    } else {
//                    if (count > max) max = count;
//                    else if (count < min) min = count;
                        all_poss.add(count);
                        count = 1;
                    }
                }
                all_poss.add(count);
//            if (count > max) max = count;
//            else if (count < min) min = count;
                Collections.sort(all_poss);
//                System.out.println(Arrays.toString(all_poss.toArray()));
                min = all_poss.get(0);
                max = all_poss.get(all_poss.size() - 1);
                System.out.println(min + " " + max);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
