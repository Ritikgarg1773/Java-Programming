package correct.ALD_endsem;
import java.util.*;

public class AdjMapGraphWeighted<T> {

    private HashMap<T, Vertex> vertexHashMap = new HashMap<>();

    public void addVertex(T value){
        vertexHashMap.put(value, new Vertex(value));
    }

    public void addEdge(T first, T second){
        Vertex f_vertex = vertexHashMap.get(first);
        Vertex s_vertex = vertexHashMap.get(second);

        if (f_vertex != null && s_vertex != null){
            f_vertex.addNeighbour(s_vertex);
            s_vertex.addNeighbour(f_vertex);
        }
    }
    public void connectedComponents(){
        ArrayList<Integer> output = new ArrayList<>();

        HashSet<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();


        for (Vertex v_start : vertexHashMap.values()) {
            int count = 0;
            if (set.contains(v_start)){
                continue;
            }

            set.add(v_start);
            stack.push(v_start);

            while (!stack.empty()){
                Vertex top = stack.pop();
                count++;
//                System.out.print(top.value + " ");
                for (Vertex padosi : top.neighbours.values()) {
                    if (!set.contains(padosi)){
                        set.add(padosi);
                        stack.push(padosi);
                    }
                }

            }

//            System.out.println();
            output.add(count);
        }
//        System.out.println(Arrays.toString(output.toArray()));
        long b = 0;
        int[] result = new int[output.size()];
        long sum =0;
        for (int i = 0; i <output.size() ; i++) {
            result[i] = output.get(i);
            sum +=result[i];
        }
//        System.out.println(Arrays.toString(result) + " " + sum);
        for(int i = 0;i<result.length;i++){
            sum = sum - result[i];
            b +=sum*result[i];
//            System.out.println(sum + " " + b);
        }
        System.out.println(b);
    }


    private class Vertex {
        private T value;
        private HashMap<T, Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new HashMap<>();
        }

        public void addNeighbour(Vertex padosi){
            neighbours.put(padosi.value, padosi);
        }

    }

    private class Edge{
        private Vertex first;
        private Vertex second;

        public Edge(Vertex first, Vertex second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        AdjMapGraphWeighted<Integer> graph = new AdjMapGraphWeighted<>();
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        for (int i = 0; i <n ; i++) {
            graph.addVertex(i);
        }
        for (int i = 0; i <p ; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            graph.addEdge(x,y);
        }
        graph.connectedComponents();
    }
}