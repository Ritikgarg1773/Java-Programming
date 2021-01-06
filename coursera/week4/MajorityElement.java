package coursera.week4;
import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a, int left, int right) {
        // if (left == right) {
        //     return -1;
        // }
        // if (left + 1 == right) {
        //     return a[left];
        // }
        // //write your code here

        // return -1;
        Arrays.sort(a);
        int count = 1;
//        System.out.println(Arrays.toString(a));
        for (int i =0;i<=a.length-2 ;i++ ) {
            if (a[i] == a[i+1]) {
                count++;
            }
            else {
                    count= 1;

            }
            if (count>a.length/2) {
                return 1;
            }
//            System.out.println(a[i] +" " + count);
        }
        return 0;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getMajorityElement(a,0,a.length));
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}


