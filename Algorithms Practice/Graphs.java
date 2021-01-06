package Algo_practice.Graphs;

import java.lang.reflect.Array;
import java.util.*;

public class Graphs {
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
//        adjList.get(v-1).add(u-1);
    }
    public void display(){
        for (int i = 0; i <this.V ; i++) {
//            System.out.println((i+1) +" -> " +Arrays.toString(adjList.get(i).toArray()));
            System.out.print((i) +" -> ");
            for (int j = 0; j <adjList.get(i).size() ; j++) {
                System.out.print(adjList.get(i).get(j) +" ");
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
            System.out.print(start+" ");

//            for (int i = 0; i <adjList.get(start).size() ; i++) {
//                if(!visited[adjList.get(start).get(i)]){
//                    visited[adjList.get(start).get(i)] = true;
//                    q.add(adjList.get(start).get(i));
//                }
//            }
            for(int i : adjList.get(start)){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public void dfsTravel(int start){
        boolean[] visited = new boolean[this.V];
        Arrays.fill(visited,false);
        Stack<Integer> s = new Stack<>();
        s.push(start);
        while(!s.isEmpty()){
            start = s.pop();
            System.out.print(start+" ");
            for (int i = 0; i <adjList.get(start).size() ; i++) {
                if(!visited[adjList.get(start).get(i)]){
                    visited[adjList.get(start).get(i)] = true;
                    s.push(adjList.get(start).get(i));
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
        for(int i =0;i<5;i++) {
            myGraph.bfsTraversal(i);
            System.out.println();
        }
        System.out.println();
        for(int i =0;i<5;i++){
            myGraph.dfsTravel(i);
            System.out.println();
        }
    }
}
