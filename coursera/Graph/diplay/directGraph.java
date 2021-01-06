package coursera.Graph.diplay;
//                    #CORRECT
import java.util.ArrayList;
import java.util.Scanner;

public class directGraph {
    int v;
    ArrayList<ArrayList<Integer>> edges;

    public directGraph(int v) {
        this.v = v;
        this.edges = new ArrayList<>();
        for (int i = 0; i <this.v ; i++) {
            ArrayList<Integer>list = new ArrayList<>();
            edges.add(list);
        }
    }
    public void addEdge(int u,int v){
        edges.get(u-1).add(v);
    }
    public void display(){
        for (ArrayList<Integer> i : edges) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        directGraph myGraph = new directGraph(v);
        for (int i = 0; i < e; i++) {
            int source = s.nextInt();
            int destination = s.nextInt();
            myGraph.addEdge(source,destination);
        }
        myGraph.display();
    }
}
