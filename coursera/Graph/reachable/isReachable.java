package coursera.Graph.reachable;

import java.util.*;

public class isReachable {
    int v;
    ArrayList<ArrayList<Integer>> edges;

    public isReachable(int v) {
        this.v = v;
        edges = new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            edges.add(a);
        }
    }
    public void addEdge(int u, int v){
        edges.get(u-1).add(v);
        edges.get(v-1).add(u);
    }
    public boolean isReachable(int source ,int destination){
        boolean[] visited = new boolean[this.v];
        Arrays.fill(visited,false);
        bfs(source-1,visited);
        if(visited[destination-1])return true;
        return false;
    }

    private void bfs(int source, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while (!q.isEmpty()){
//            System.out.println(Arrays.toString(visited));
//            System.out.println(q);
            source = q.remove();
            for (int i : edges.get(source)){
                if(!visited[i-1]){
                    visited[i-1] = true;
                    q.add(i-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        isReachable myGraph = new isReachable(v);
        for (int i = 0; i < e; i++) {
            int source = s.nextInt();
            int destination = s.nextInt();
            myGraph.addEdge(source,destination);
        }
        int u = s.nextInt();
        int v1 = s.nextInt();

        System.out.println(myGraph.isReachable(u,v1));
    }
}
