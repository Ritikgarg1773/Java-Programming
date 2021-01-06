package correct.Apri_longchallenge;
//                            #CORRECT
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class CARSELL {
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
                catch (IOException  e)
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
    public static void main(String[] args) throws IOException {
        try{
            FastReader s = new FastReader();
                int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int N = s.nextInt();
                Long[] array = new Long[N];
                for (int j = 0; j < N; j++) {
                    array[j] = s.nextLong();
                }
                Arrays.sort(array, Collections.reverseOrder());
//                System.out.println(Arrays.toString(array));
                long counter = 0;
                long a;
                for (int j = 0; j <N ; j++) {
                    a = array[j] - j;
                    if (a > 0) counter+=a;
//                    System.out.println(a +" " + counter);
                }
                System.out.println(counter %(1000000000+7));
            }
        }
        catch(Exception e){
            return;
        }
    }
}
