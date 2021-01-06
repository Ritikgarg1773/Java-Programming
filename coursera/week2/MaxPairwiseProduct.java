package coursera.week2;
//                #CORRECT
import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        long max_product;
        int n = numbers.length;
        long max1 = 0;
        int max1_index = 0;
        long max2 = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > max1){
                max1 = numbers[i];
                max1_index = i;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (numbers[i] > max2 && i!= max1_index){
                max2 = numbers[i];
            }
        }
//        System.out.println(max1 +" " + max2);

        max_product = max1 * max2;
        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}

