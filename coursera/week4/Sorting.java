package coursera.week4;
import java.io.*;
import java.util.*;

public class Sorting {
    private static Random random = new Random();
    private static void swap(int[] a, int i ,int  j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static int[] partition3(int[] a, int l, int r) {
        //write your code here
        int n = a.length;
        swap(a,n,random.nextInt(n - l + 1) + l );
        int i = 1;
        int k = 1;
        int p = n;
        while(i<p){
            if (a[i] < a[n]) {
                swap(a,i,k);
                i++;
                k++;
            }
            else if (a[i] == a[n]) {
                swap(a,i,p);
                p--;
            }
            else{
                i++;
            }
        }

        int m1 = l;
        int m2 = r;
        int[] m = {m1, m2};
        return m;
    }

    private static int partition2(int[] a, int l, int r) {
        int x = a[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (a[i] <= x) {
                j++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[l];
        a[l] = a[j];
        a[j] = t;
        return j;
    }

    private static void randomizedQuickSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int k = random.nextInt(r - l + 1) + l;
        int t = a[l];
        a[l] = a[k];
        a[k] = t;
        //use partition3
        int m = partition2(a, l, r);
        randomizedQuickSort(a, l, m - 1);
        randomizedQuickSort(a, m + 1, r);
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // randomizedQuickSort(a, 0, n - 1);
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
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


