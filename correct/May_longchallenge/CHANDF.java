package correct.May_longchallenge;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class CHANDF {
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

        public void print(Object... objects) {
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
    static class Node{
         long val;
         long j;
        public Node(long val, long j){
            this.val = val;
            this.j = j;
        }
        public long getval(){
            return this.val;
        }


        public long getj() {
            return this.j;
        }
    }
    static int largestNum(int n)
    {

        int num = 0;

        // Iterate through all possible values
        for (int i = 0; i <= 32; i++)
        {
            // Multiply the number by 2 i times
            int x = (1 << i);

            if ((x - 1) <= n)
                num = (1 << i) - 1;

            else
                break;
        }

        // Return the final result
        return num;
    }
    static long maximizeBits(long a, long b) {
        if (a == b) {
            return b;
        }
        long m = a ^ b, pow2 = 1; // MSB of m=a^b is bit that we need to find
        while (m > pow2) { // Set other bits to 0
            if ((m & pow2) != 0) {
                m ^= pow2;
            }
            pow2 <<= 1;
        }

        long res = a | (m - 1); // Now m is in form of 2^n and m - 1 would be mask of n-1 bits
        if ((res | b) <= b) { // Fix of problem if all n bits in b are set to 1
            res = b;
        }
//        String t = Long.toBinaryString(res) +'0';
//        System.out.println(t +" " +Long.parseLong(t,2));
//        System.out.println(res +"-> largest number with max 1");
        return res;
    }
        public static void main(String[] args) {
        try{
            InputReader s = new InputReader(System.in);
//            Scanner s = new Scanner(System.in);
            OutputWriter out = new OutputWriter(System.out);
            int T = s.readInt();
            for (int i = 0; i <T ; i++) {
                long X = s.readLong();
                long Y = s.readLong();
                long L = s.readLong();
                long R = s.readLong();
                long min = X|Y;

                if (X==0 || Y == 0 ) System.out.println(0);
                else{
//                    TreeMap<Long,Long> a = new TreeMap<>();
//                    for (long j = L; j <= R; j++) {
////                        Long b = (X & j) * (Y & j);
////                        Node r = new Node(b, j);
////                        a1.add(r);
//                    a.put(j,(X&j)*(Y&j));
//                    }
//                    for (Map.Entry m :a.entrySet()
//                     ) {
//                    System.out.println(m.getKey()+" " + m.getValue());
//                }
                    if (R >= min) {
                        System.out.println(min+" ;");
                    }
                    else {
//                        String s1 = "";
//                        s1 = s1.toLowerCase();
//                        String d = "";
//                        for(int i1 =0;i1<s1.length() ;i1++){
//                            if(Character.isDigit(s1.charAt(i1) || Character.isLetter(s1.charAt(i1)))){
//                                d = s.charAt(i) + d;
//                            }
//                        }
//                        for(int i =0;i<d.length();i++){
//                            if(d.charAt(i) != d.charAt(d.length()-1-i)){
//                                return 0;
//                            }
//                        }
                        String A = "1000";
                        BigInteger o= new BigInteger(A);
//                        BigInteger o1 = new BigInteger(A-1);
                        BigInteger X1 = BigInteger.valueOf(X);
                        BigInteger Y1 = BigInteger.valueOf(Y);
                        BigInteger L1  = BigInteger.valueOf(L);
                        BigInteger R1 = BigInteger.valueOf(R);
                        BigInteger max1 = X1.and(L1).multiply(Y1.and(L1));
                        BigInteger m = BigInteger.valueOf(L);
                        BigInteger j1 = BigInteger.valueOf(L);
                        System.out.println(j1.compareTo(R1));
                        while (j1.compareTo(R1) < 0){
                            BigInteger t1 = X1.and(j1).multiply(Y1.and(j1));
//                            System.out.println(t1 +" "+ j1);
                            if (t1.compareTo(max1) >0) {
                                max1 = t1;
                                m = j1;
                            }
                            j1 = j1.add(BigInteger.ONE);
//                            System.out.println(j1);
                        }
                        System.out.println(m);
                        long max = (X&L)*(Y&L);
                        long m1 = L;
                        if (R <= 10) {
                            for (long j = L; j <= R; j++) {
                                long t = (X & j) * (Y & j);
//                                System.out.println(t +" " + j);
                                if (t > max) {
                                    max = t;
                                    m1 = j;
                                }
                            }
                            System.out.println(m1);
                        } else {
                            long f = (R & (R - 1));
                            if (f == 0) System.out.println(R - 1);
                            else System.out.println(R+"a");
                        }
                    }
                }
            }
            out.close();
        }
        catch (Exception e){
            return;
        }
    }
}
