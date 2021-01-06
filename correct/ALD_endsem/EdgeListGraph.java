package correct.ALD_endsem;


import java.util.ArrayList;
import java.util.Scanner;
//import java.util.LinkedList;

public class EdgeListGraph <T> {

    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public EdgeListGraph() {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    public void addEdge(T start, T end){
        if (exists(start) && exists(end)) {
            edges.add(new Edge(start, end));
        }
        Vertex V_start = null;
        Vertex V_end = null;
        for (int i = 0; i <vertices.size() ; i++) {
            if (start == vertices.get(i)){
                V_start = vertices.get(i);
            }
            if (end == vertices.get(i)){
                V_end = vertices.get(i);
            }
        }
        V_start.neighbours.add(V_end);
        V_end.neighbours.add(V_start);
    }

    private boolean exists(T value){
        for (Vertex v: vertices) {
            if (v.value.equals(value)){
                return true;
            }
        }
        return false;
    }

    private class Vertex {
        private T value;
        private ArrayList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new ArrayList<>();
        }

//        public void addNeighbours(int value) {
//            neighbours.add(value);
//        }
    }

    private class Edge {
        private T start;
        private T end;

        public Edge(T start, T end) {
            this.start = start;
            this.end = end;
        }
    }
    private int Components(){
        int result = 0;
        int[] visited = new int[edges.size()];
        for (int i = 0; i <edges.size() ; i++) {
            if (visited[i] == 0){
//                dfs(edges,i,visited);
                result++;
            }
        }
        return result;
    }

//    private void dfs(ArrayList<Edge> edges1, int i, int[] visited) {
//        visited[i] = 1;
//        for (int j = 0; j <edges1.get(i). ; j++) {
//
//        }
//    }

    public static void main(String[] args) {
        EdgeListGraph<Integer> graph = new EdgeListGraph<>();
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int p =s.nextInt();
        for (int i = 0; i <n ; i++) {
            graph.addVertex(i);
        }
        for (int i = 0; i <p ; i++) {
            int x = s.nextInt();
            int y =s.nextInt();
            graph.addEdge(x,y);
            graph.addEdge(y,x);
        }

//        graph.countComponents();
    }
}