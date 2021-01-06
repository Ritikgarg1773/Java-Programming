package correct.June_longchallenge;
//                    #CORRECT
import java.io.*;
import java.util.InputMismatchException;


public class EVENM {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object...objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
//                    writer.print(1);
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
    public static void main(String[] args) throws IOException {
        try{
            InputReader s = new InputReader(System.in);
            OutputWriter out = new OutputWriter(System.out);
            int T = s.readInt();
            for (int i = 0; i <T ; i++) {
                int n = s.readInt();
                int[][] array = new int[n][n];
                int counter = 1;
                for (int j = 0; j <n ; j++) {
                    for (int k = 0; k <n ; k++) {
                        array[j][k] = counter++;
                    }
                }
                if (n%2 == 1){
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k <n ; k++) {
                            out.print(array[j][k] +" ");
                        }
                        out.printLine();
                    }
                }
                else {
                    for (int j = 1; j <n ; j+=2) {
                        for (int k = 0; k <n-1 ; k+=2) {
                            int temp = array[j][k];
                            array[j][k] = array[j][k+1];
                            array[j][k+1] = temp;
                        }
                    }
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k <n ; k++) {
                            out.print(array[j][k] +" ");
                        }
                        out.printLine();
                    }
                }
//                System.out.println(Arrays.deepToString(array));
            }
            out.close();
        }
        catch (Exception e){
            return;
        }
    }

    private static void swap(int[][] array, int i, int j) {

    }

//    private static void swap(int[][] array, int j) {
//        int x = array[0][0] + array[j][j];
////        int y =
////        if ()
//    }
}
