package coursera.Graph.diplay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class weightedGraph {
    int v;
    ArrayList<ArrayList<int[]>> edges;

    public weightedGraph(int v) {
        this.v = v;
        edges = new ArrayList<>();
        for (int i = 0; i <this.v ; i++) {
            ArrayList<int[]> list= new ArrayList<>();
//            int[] arr = new int[2];
//            list.add(arr);
            edges.add(list);
        }
    }
    public void addEdge(int u, int v, int wt){
        int[] arr = new int[]{v,wt};
        edges.get(u-1).add(arr);
    }
    public void display(){
        for (ArrayList<int[]> i: edges){
            for (int[] a : i){
                System.out.print(Arrays.toString(a) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        weightedGraph myGraph = new weightedGraph(v);
        for (int i = 0; i <e ; i++) {
            int source = s.nextInt();
            int destination = s.nextInt();
            int wt = s.nextInt();
            myGraph.addEdge(source,destination,wt);
        }
        myGraph.display();
    }
}
