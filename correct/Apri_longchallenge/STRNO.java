package correct.Apri_longchallenge;
//                            #Correct
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class STRNO {
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

    static int  factorize(long n) {
        int count = 0;
        // count the number of times 2 divides
        while (!(n % 2 > 0)) {
            // equivalent to n=n/2;
            n >>= 1;

            count++;
        }
        // if 2 divides it
//        if (count > 0) {
//            System.out.println("2" + " " + count);
//        }

        // check for all the possible
        // numbers that can divide it
        for (long i = 3; i <= (long) Math.sqrt(n); i += 2) {
//            count = 0;
            while (n % i == 0) {
                count++;
                n = n / i;
            }
//            if (count > 0) {
//                System.out.println(i + " " + count);
//            }
        }

        // if n at the end is a prime number.
        if (n > 2) {
            count+=1;
//            System.out.println(n + " " + "1");
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        try {
            long start = System.currentTimeMillis();
            FastReader s = new FastReader();
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int X = s.nextInt();
                int K = s.nextInt();
                if (K == 0)
                    System.out.println(0);
                else if (K== 1) {
                    if (X <= 1) System.out.println(0);
                    else System.out.println(1);

                }
                else if (K == 2){
                        if (X <=3) {
                            System.out.println(0);

                        }
                        BigInteger x = new BigInteger(String.valueOf(X));
                        if (x.isProbablePrime(1)){
                            System.out.println(0);
                        }
                        else System.out.println(1);

                }
                else if (K >=3){
//                    if (X < Math.pow(2,K)){
//                        System.out.println(0);
//
//                    }

                    int  p = factorize(X);
//                    System.out.println(p.size());
//                    System.out.println(size.compareTo(k1) +" " + size.equals(k1));
                    if (p>=K){
                        System.out.println(1);
                    }
                    else System.out.println(0);
                }


            }
            long end = System.currentTimeMillis();
            long elapsedTime = end - start;
            System.out.println(elapsedTime/1000F);
        }
        catch(Exception e){
            return;
        }
    }

}
