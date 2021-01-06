package correct.ALD_endsem;
import java.util.*;
//                    #CORRECT

public class AdjListGraph {

    private ArrayList<Vertex> vertices;

    public AdjListGraph() {
        vertices = new ArrayList<>();
    }

    public void addVertex(int value){
        vertices.add(new Vertex(value));
    }

    public void addEdge(int start, int end){
        Vertex s_v = find(start);
        Vertex e_v = find(end);
        if (s_v != null && e_v != null){
            s_v.neighbours.add(e_v);
            e_v.neighbours.add(s_v);
        }
    }

    private Vertex find(int value){
        for (Vertex v: vertices) {
            if (v.value == (value)){
                return v;
            }
        }
        return null;
    }


    private class Vertex {
        private int value;
        private ArrayList<Vertex> neighbours;

        public Vertex(int value) {
            this.value = value;
            neighbours = new ArrayList();
        }
    }
    public void connectedComponents(){
        ArrayList<Integer> output = new ArrayList<>();
        int[] visited = new int[vertices.size()];
        Stack<Vertex> stack = new Stack<>();
        for (Vertex v_start:vertices){
            int count = 0;
            if(visited[v_start.value] != 0)continue;
            visited[v_start.value] = 1;
            stack.push(v_start);
            while (!stack.empty()){
                count++;
                Vertex top = stack.pop();
//                System.out.println(top.value+" ");
                for (Vertex neighbour : top.neighbours){
                    if (visited[neighbour.value] == 0){
                        visited[ neighbour.value] = 1;
                        stack.push(neighbour);
                    }
                }
            }
            output.add(count);

        }
        long b = 0;
        long sum =0;
        for (Integer integer : output) {
            sum += integer;
        }
        for (Integer integer : output) {
            sum = sum - integer;
            b += sum * integer;
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        AdjListGraph graph = new AdjListGraph();
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
//            graph.addEdge(y,x);
        }
        graph.connectedComponents();
    }
}
