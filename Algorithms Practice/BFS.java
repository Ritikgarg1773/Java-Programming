package Algo_practice.Graphs;

import java.util.*;

public class BFS {
    static class Graphs {
        int V;                              // number of vertices
        ArrayList<ArrayList<Integer>> adjList;       // to maintain edges
        public Graphs(int V){
            this.V = V;
            this.adjList = new ArrayList<>();
            for (int i = 0; i <this.V ; i++) {
                ArrayList<Integer> l = new ArrayList<>();
                this.adjList.add(l);
//            this.adjList[i] = new LinkedList<>();
            }
        }
        public void addEdge(int u, int v){
            adjList.get(u-1).add(v-1);
//        adjList[v-1].add(u);
        }
        public void display(){
            for (int i = 0; i <this.V ; i++) {
//            System.out.println((i+1) +" -> " +Arrays.toString(adjList.get(i).toArray()));
                System.out.print((i+1) +" -> ");
                for (int j = 0; j <adjList.get(i).size() ; j++) {
                    System.out.print( adjList.get(i).get(j) +" ");
                }
                System.out.println();
            }
        }

        public void bfsTraversal(int start) {
            boolean[] visited = new boolean[this.V];
            Arrays.fill(visited,false);
            Queue<Integer> q = new LinkedList<>();
            visited[start] = true;
            q.add(start);
            while (!q.isEmpty()){
//                System.out.println(q);
                start = q.remove();
                System.out.print(start+1+" ");

                for (int i = 0; i <adjList.get(start).size() ; i++) {
                    if(!visited[adjList.get(start).get(i)]){
                        visited[adjList.get(start).get(i)] = true;
                        q.add(adjList.get(start).get(i));
                    }
                }
            }
        }

        public static void main(String[] args) {
            Graphs myGraph = new Graphs(5);
            myGraph.addEdge(1,2);
            myGraph.addEdge(1,3);
            myGraph.addEdge(2,4);
            myGraph.addEdge(2,5);
            myGraph.addEdge(3,4);
            myGraph.addEdge(4,5);
            myGraph.display();
            myGraph.bfsTraversal(0);
        }
    }
}
