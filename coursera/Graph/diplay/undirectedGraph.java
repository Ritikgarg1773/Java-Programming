package coursera.Graph.diplay;

import java.util.ArrayList;
import java.util.Scanner;

public class undirectedGraph {
    int V;
    ArrayList<ArrayList<Integer>> edges;
    public undirectedGraph(int V){
        this.V = V;
        edges = new ArrayList<>();
        for (int i = 0; i <this.V ; i++) {
            ArrayList<Integer> list= new ArrayList<>();
            edges.add(list);
        }
    }
    public void addEdge(int u, int v){
        edges.get(u-1).add(v);
        edges.get(v-1).add(u);
    }
    public void display(){
        for(ArrayList<Integer> i : edges){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v= s.nextInt();
        int e = s.nextInt();
        undirectedGraph myGraph = new undirectedGraph(v);
        for (int i = 0; i <e ; i++) {
            int source = s.nextInt();
            int destination = s.nextInt();
            myGraph.addEdge(source,destination);
        }
        myGraph.display();
    }
}
