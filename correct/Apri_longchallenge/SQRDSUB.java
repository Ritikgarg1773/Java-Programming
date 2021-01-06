package correct.Apri_longchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SQRDSUB {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    static long counter = 0;
    static long number = 0;
    static void printDistProduct(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            // j is the number of elements which should be printed
            for (int j = i; j < n; j++)
            {
                long product = 1;
                // print the array from i to j
                for (int k = i; k <= j; k++)
                {
//                    System.out.print(arr[k]+" ");
                    product *= arr[k];
                    number++;
                }

//                System.out.println(product +" -> product");
                if (product%2 == 1){
                    counter++;
//                    System.out.println(product +" " + counter);
                }
                else if (product%4 == 0) {
                        counter ++;
//                    System.out.println(product +" " + counter);
//                        System.out.println(product)
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try {
            FastReader s = new FastReader();
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N = s.nextInt();
                int[] array = new int[N];
                for (int j = 0; j < N; j++) {
                    array[j] = Math.abs(s.nextInt());
                }
                printDistProduct(array, array.length);
//                System.out.println(Arrays.toString(multiple.toArray()));
//                System.out.println(counter);
                System.out.println(number);
                number = 0;
                counter = 0;
            }
        }
        catch(Exception e){
            return;
        }
    }

}
