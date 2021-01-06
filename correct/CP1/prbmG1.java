package correct.CP1;
//                    #CORRECT
import java.io.*;
import java.util.*;

public class prbmG1 {
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
    static class node{
        int questions;
        int penalty;
        public node(int questions,int penalty){
            this.questions = questions;
            this.penalty = penalty;
        }

        public int getQuestions() {
            return questions;
        }

        public void setQuestions(int questions) {
            this.questions = questions;
        }

        public int getPenalty() {
            return penalty;
        }

        public void setPenalty(int penalty) {
            this.penalty = penalty;
        }
    }

    public static void main(String[] args) {
        InputReader s = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        int n = s.readInt();
        int q = s.readInt();
        HashMap<Integer,node> map = new HashMap<Integer, node>();
        Set<Integer> set = new HashSet<>();
//        TreeMap<Integer,node> sorted_map = new TreeMap<Integer,node>((Map<? extends Integer, ? extends node>) bvc);
        node a1 = new node(0,0);
        map.put(1,a1);
        for (int i = 0; i <q; i++) {
            int key = s.readInt();
            int penalty = s.readInt();
            if(map.containsKey(key)){
                node a = map.get(key);
                a.setQuestions(a.getQuestions()+1);
                a.setPenalty(a.getPenalty()+penalty);
                map.put(key,a);
            }
            else {
                node a = new node(1,penalty);
                map.put(key,a);
            }
            int ques = map.get(1).getQuestions();
            int penal = map.get(1).getPenalty();
//            System.out.println(ques +" " + penal);
            if(key == 1){
                for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
                    int check_key = it.next();
                    if(map.get(check_key).getQuestions()<ques)it.remove();
                    else if(map.get(check_key).getQuestions()==ques){
                        if(map.get(check_key).getPenalty()>=penal) it.remove();
                    }
                }
            }
            else {
                if(map.get(key).getQuestions()>ques) set.add(key);
                else if(map.get(key).getQuestions() == ques){
//                    System.out.println(map.get(key).getPenalty() + "  "+ penal);
                    if(map.get(key).getPenalty() < penal) set.add(key);
                }
            }
//            System.out.println(set);
            out.printLine(set.size()+1);
        }
        out.close();
    }

}
