package correct.done;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;
import static java.lang.System.out;

public class vipul {
    static class node{
        int i;
        int j;

        public node(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }
    }
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        List<String> list_test_cases = new ArrayList<String>();
        ArrayList<ArrayList<node>> output = new ArrayList<>();
        BufferedReader buffer;
        BufferedWriter writer = null;
        try {
            buffer = new BufferedReader(new FileReader("D:\\IntelliJ IDEA 2019.3.3\\Java_projects\\src\\com\\company\\input.txt"));
            writer = new BufferedWriter(new FileWriter("D:\\IntelliJ IDEA 2019.3.3\\Java_projects\\src\\com\\company\\output.txt"));
            String line = buffer.readLine();
            while(line!=null) {
                list_test_cases.add(line);
                line = buffer.readLine();
            }

        }
        catch(Exception e) {
            out.println(e);
            e.printStackTrace();
        }
//        System.out.println(Arrays.toString(list_test_cases.toArray()));
//        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(list_test_cases.get(0));
        int[][] array = new int[n][n];
        int counter = 0;
//        s.nextLine();
        int flag = 1;

        for (int i = 0; i <n ; i++) {
            String f = list_test_cases.get(i+1);
            for (int j = 0; j <n ; j++) {
                array[i][j] = f.charAt(j) - '0';
                if (array[i][j] == 0) counter++;
            }
        }
        if(n*n == counter) {
            writer.write("0");
            writer.newLine();
            System.out.println(0);
            exit(0);
        }
        if ((n - counter)%2 == 1){
            writer.write("0");
            writer.newLine();System.out.println(0);
        }
        else {
//            System.out.println(1);
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    if (array[i][j] == 1 ) {
                        if (j+1 != n  && array[i][j + 1] == 1 ) {
                            node b1 = new node(i,j);
                            node b2 = new node(i,j+1);
                            ArrayList<node> tile = new ArrayList<>();
                            tile.add(b1);
                            tile.add(b2);
                            output.add(tile);
//                            System.out.println(i + " " + j + " - " + (i) + " " + (j + 1));
                            array[i][j] = 0;
                            array[i][j + 1] = 0;
                        }
                        else if (i+1 != n && array[i + 1][j] == 1 ) {
                            node b1 = new node(i,j);
                            node b2 = new node(i+1,j);
                            ArrayList<node> tile = new ArrayList<>();
                            tile.add(b1);
                            tile.add(b2);
                            output.add(tile);
//                            System.out.println(i + " " + j + " - " + (i + 1) + " " + (j));
                            array[i][j] = 0;
                            array[i + 1][j] = 0;
                        }
                    }
                }
            }
//            System.out.println();
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    if (array[i][j] == 1) {
                        flag = 0;
                        break;
                    }
//                    System.out.print(array[i][j] +" ");
                }
//                System.out.println();
            }
//            out.println("hello");
//            writer.write("hello");
            if (flag == 0){
//                writer.newLine();
                writer.write("0");
                writer.newLine();
                System.out.println(0);
            }
            else {
                writer.write("1");
                writer.newLine();
                System.out.println(1);
                for (ArrayList<node> tile : output) {
                    for(node b : tile) {
                        writer.write("(" +b.getI() +"," + b.getJ() + ")");
                        out.print("(" +b.getI() +"," + b.getJ() + ")");
                    }
//                    out.println(Arrays.toString(tile.toArray()));
                    writer.newLine();
                    out.println();
                }

            }
        }
//        writer.write("hello");
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        out.println(totalTime/Math.pow(10,9));
        writer.flush();
        writer.close();
    }
}
