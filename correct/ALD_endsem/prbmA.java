package correct.ALD_endsem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class prbmA {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n= s.nextInt();
//        int p = s.nextInt();
//        int[] check = new int[n];
//
//        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
//        ArrayList<Integer> array = new ArrayList<>();
//        output.add(array);
//        int a = s.nextInt();
//        check[a] = 1;
//        array.add(a);
//        int b= s.nextInt();
//        check[b] = 1;
//        array.add(b);
////        BigInteger count= BigInteger.ZERO;
////        System.out.println(Arrays.toString(array.toArray()));
//        for (int i = 1; i <p ; i++) {
////            ArrayList<Integer> a1 = null;
//            int x = s.nextInt();
//            check[x] = 1;
//            int y = s.nextInt();
//            check[y] = 1;
//            int flag = 0;
//            for (int k = 0; k<output.size();k++ ) {
//                int size = output.get(k).size();
//                for (int j = 0; j < size; j++) {
//                    if (x == output.get(k).get(j)) {
////                    array.add(x);
//                        output.get(k).add(y);
//                        flag = 1;
////                        size++;
//                        break;
//                    }
//                    else if (y == output.get(k).get(j)){
//                        output.get(k).add(x);
//                        flag = 1;
//                        break;
//                    }
//                }
//            }
//            if (flag == 0) {
//                ArrayList<Integer> a1 = new ArrayList<>();
//                a1.add(x);
//                a1.add(y);
//                output.add(a1);
//            }
////            System.out.println(Arrays.toString(array.toArray()));
////            System.out.println(Arrays.toString(a1.toArray()));
//        }
////        out.println(Arrays.toString(check));
//        for (int i = 0; i <n ; i++) {
//            if (check[i]== 0){
//                ArrayList<Integer> m = new ArrayList<>();
//                m.add(i);
//                output.add(m);
//            }
//        }
////        out.println(output.size());
//        out.println(Arrays.deepToString(output.toArray()));
//        long b1 = 0;
//        int[] result = new int[output.size()];
//        long sum =0;
//        for (int i = 0; i <output.size() ; i++) {
//            result[i] = output.get(i).size();
//            sum +=result[i];
//        }
////        System.out.println(Arrays.toString(result) + " " + sum);
//        for(int i = 0;i<result.length;i++){
//            sum = sum - result[i];
//            b1 +=sum*result[i];
////            System.out.println(sum + " " + b);
//        }
//        System.out.println(b1);
//    }
private static int numberOfComponents(ArrayList<Integer>[] adj) {
    int result = 0;
    ArrayList<Integer> output = new ArrayList<>();
    //write your code here
    int[] visited = new int[adj.length];
    for (int i = 0; i < adj.length; i++) {
        int  count = 0;
        if (visited[i] == 0) {
            count=explore(adj, i, visited);
            result++;
        }
        output.add(count);
    }
    out.println(Arrays.toString(output.toArray()));
    return result;
}

    private static int explore(ArrayList<Integer>[] adj, int x, int[] visited) {
        visited[x] = 1;
        int count = 1;
        for (int i = 0; i < adj[x].size(); i++) {
            if (visited[adj[x].get(i)] == 0) {
                count++;
                explore(adj, adj[x].get(i), visited);
            }
        }
//        out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        System.out.println(numberOfComponents(adj));
    }
}
