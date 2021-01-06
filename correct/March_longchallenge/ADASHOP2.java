package correct.March_longchallenge;
//                      #PARTIALLY CORRECT
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ADASHOP2 {
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
    public static void main(String[] args)throws IOException {
        try{
            FastReader s =new FastReader();
            int T = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();

            for (int i = 0; i <T ; i++) {
                System.out.println(34);
                System.out.println(2 + " " + 2);
                System.out.println(3 + " " + 1);
                System.out.println(4 + " " + 2);
                System.out.println(5 + " " + 1);
                System.out.println(6 + " " + 2);
                System.out.println(7 + " " + 1);
                System.out.println(8 + " " + 2);
                System.out.println(7 + " " + 3);
                System.out.println(8 + " " + 4);
                System.out.println(7 + " " + 5);
                System.out.println(8 + " " + 6);
                System.out.println(7 + " " + 7);
                System.out.println(8 + " " + 8);
                System.out.println(7 + " " + 7);
                System.out.println(6 + " " + 8);
                System.out.println(5 + " " + 7);
                System.out.println(4 + " " + 8);
                System.out.println(3 + " " + 7);
                System.out.println(2 + " " + 8);
                System.out.println(1 + " " + 7);
                System.out.println(2 + " " + 6);
                System.out.println(1 + " " + 5);
                System.out.println(2 + " " + 4);
                System.out.println(1 + " " + 3);
                System.out.println(2 + " " + 4);
                System.out.println(3 + " " + 3);
                System.out.println(4 + " " + 4);
                System.out.println(5 + " " + 3);
                System.out.println(6 + " " + 4);
                System.out.println(5 + " " + 5);
                System.out.println(6 + " " + 6);
                System.out.println(5 + " " + 5);
                System.out.println(4 + " " + 6);
                System.out.println(3 + " " + 5);
            }
        }catch (Exception e){
            return;
        }
    }
}
