package correct.Apri_longchallenge;
//                            #CORRECT
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class COVIDLQ {
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

    public static void main(String[] args) throws IOException {
        try{
            FastReader s = new FastReader();
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int N = s.nextInt();
                int[] array = new int[N];
                for (int j = 0; j < N; j++) {
                    array[j] = s.nextInt();
                }
                int flag = 1;
                int counter = 6;
                for (int j = 0; j <N ; j++) {
                    if (array[j] == 1){
                        if (counter < 5){
                            flag = 0;
                            break;
                        }
                        else
                        counter = 0;
                    }
                    else {
                        counter ++;
                    }
//                    System.out.println(counter);
                }
                if (flag == 0){
                    System.out.println("NO");
                }
                else System.out.println("YES");
            }
        }
        catch (Exception e){
            return;
        }
    }
}
