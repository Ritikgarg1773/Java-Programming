package correct.JulyLongChallenge;

import java.io.*;
import java.util.*;

public class CHFNSWPS {

    public static void main(String[] args)throws IOException {
        try {
            InputReader scn = new InputReader(System.in);
            OutputWriter out = new OutputWriter(System.out);
            int T = scn.readInt();
            for(int m = 0;m<T;m++) {
                int N = scn.readInt();
                long[] A = new long[N], B = new long[N];

                for (int i = 0; i < N; i++) { // so that we doesn't need to work upon them.
                    A[i] = scn.readLong();
                }
                for (int i = 0; i < N; i++) {
                    B[i] = scn.readLong();
                }
                Arrays.sort(A);
                Arrays.sort(B);
                boolean check = CountFrequencies(A, B);
                if (check) {
                    boolean[] bool = new boolean[N]; // boolean array to know with pairs are already paired
                    Arrays.fill(bool,false);
                    for (int i = 0; i < N; i++) {
                        long a = A[i];
                        long b = B[i];
                        if (a == b) {
                            bool[i] = true;
                        }
                    }
                    ArrayList<Long> listA = new ArrayList<>();
                    ArrayList<Long> listB = new ArrayList<>();
                    for (int i = 0; i < N - 1; i++) {
                        if (!bool[i] && !bool[i + 1]) {
                            long a = A[i];
                            long b = A[i + 1];
                            if (a == b) {
                                listA.add(a);
                                i++;
                            }
                        }
                    }
                    for (int i = 0; i < N - 1; i++) {
                        if (!bool[i] && !bool[i + 1]) {
                            long a = B[i];
                            long b = B[i + 1];
                            if (a == b) {
                                listB.add(a);
                                i++;
                            }
                        }
                    }
//                    System.out.println(listA);
//                    System.out.println(listB);
                    List<Long> common = new ArrayList<>(listA);
                    common.retainAll(listB);
                    for (int i = 0; i < common.size(); i++) {
                        long a = common.get(i);
                        long val1 = Collections.binarySearch(listA, a);
                        if (val1 != -1) {
                            listA.remove(val1);
                        }
                        long val2 = Collections.binarySearch(listB, a);
                        if (val2 != -1) {
                            listB.remove(val2);
                        }
                    }
//                    System.out.println(listA);
                    long ans = 0;
                    long min = Math.min(A[0], B[0]);
                    listA.addAll(listB);
                    Collections.sort(listA);
                    for (int i = 0; i < listA.size()/2; i++) { // two pointer approach
//                        int j = listA.size() - 1 - i;
                        long a = listA.get(i);
                        ans+=Math.min(2*min,a);
//                        int b = listB.get(j);
//                        int val1 = Math.min(a, b);
//                        if (a == min || b == min) {
//                            ans += min; // swap min element
//                        } else {
//                            int adding = Math.min(2 * min, val1);
//                            ans = ans + adding; // adding is basically minimum among the minimum
//                        }
                    }
                    out.printLine(ans);
                } else {
                    out.printLine(-1);
                }
            }
            out.close();
        }
        catch (Exception e){
            return;
        }
    }

    public static boolean CountFrequencies(long[] arr, long[] arr1) {
        HashMap<Long,Long> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            long a = arr[i];
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, (long)1);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            long a = arr1[i];
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, (long)1);
            }
        }
        // basically putting all element of Array A and Array B in HashMap
        boolean check = true;
        for (long name : map.keySet()) {
            long value = map.get(name);
            if (value % 2 != 0) { // if value of any element is odd then it cannot get paired
                check = false; // false for '-1' answer
                break;
            }
        }
        return check; // true for every element has even frequency to get paired
    }
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
}