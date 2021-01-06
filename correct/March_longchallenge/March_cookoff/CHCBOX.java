package correct.March_longchallenge.March_cookoff;

import java.io.IOException;
import java.util.Scanner;

public class CHCBOX {
    public static void main(String[] args)throws IOException {
        try {
            Scanner s= new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int N = s.nextInt();
                int counter = N-1;
                int[] array = new int[N];
                for (int j = 0; j < N; j++) {
                    array[j] = s.nextInt();
                }
                int max = array[N-1];
                for (int j = N-2; j > 0; j--) {
                    if (array[j] > max){
                        counter = j;
                        max = array[j];
                    }
                }
                System.out.println(counter -(N/2) +1);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
