package correct.Apri_longchallenge;
//                            #CORRECT
import java.io.*;
import java.util.InputMismatchException;

public class UNITGCD1 {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }


        public interface SpaceCharFilter {
             boolean isSpaceChar(int ch);
        }
    }
    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public void print(Object...objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object...objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }
    }
    static int power(int x, int y, int p) {

        int res = 1; // Initialize result

        x = x % p;

        while (y > 0) {

            if ((y & 1) == 1)
                res = (res * x) % p;

            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }

        return res;
    }

    static boolean miillerTest(int d, int n) {

        int a = 2 + (int)(Math.random() % (n - 4));

        int x = power(a, d, n);

        if (x == 1 || x == n - 1)
            return true;

        while (d != n - 1) {
            x = (x * x) % n;
            d *= 2;

            if (x == 1)
                return false;
            if (x == n - 1)
                return true;
        }

        return false;
    }
    static boolean isPrime(int n, int k) {

        if (n <= 1 || n == 4)
            return false;
        if (n <= 3)
            return true;
        int d = n - 1;

        while (d % 2 == 0)
            d /= 2;

        for (int i = 0; i < k; i++)
            if (!miillerTest(d, n))
                return false;

        return true;
    }
    public static void main(String[] args) throws IOException {
        try{
            InputReader s = new InputReader(System.in);
            OutputWriter out = new OutputWriter(System.out);
//            long start = System.currentTimeMillis();
            int T = s.readInt();
            for (int i = 0; i < T; i++) {
                int number = s.readInt();
                if (number == 1){
                    out.printLine(1);
                    out.printLine(1 + " " + 1);
                }
                else if (number == 2) {
                    out.printLine(1);
                    out.printLine(2 + " " + 1 + " " + 2);
                } else if (number == 3){
                    out.printLine(1);
                    out.printLine(3 +" " + 1 +" " + 2 + " " + 3);
                }
                else {
                    out.printLine( 1 + (number-2)/2);
                    out.printLine(3 +" " + 1 +" " + 2 + " " + 3);
                    for (int j = 4; j <=number ; j+=2) {
                        if (j == number) out.printLine(1 +" " +number);
                        else out.printLine(2 +" " + j +" " + (j+1));
                    }
                }
            }
            out.close();
        }
        catch (Exception e){
        }
    }
}
