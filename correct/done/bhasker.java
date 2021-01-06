package correct.done;
import java.util.*;
import java.io.*;
class edge{
    int src,dest;
    long weight;
    edge(int s, int d, long w){
        this.src=s;
        this.dest=d;
        this.weight=w;
    }
}

public class bhasker{
    public static int mindist(long dist[], int spt[]) {
        int V=dist.length;
        long min=Long.MAX_VALUE;
        int minind=-1;
        for(int v=0;v<V;v++) {
            if(spt[v]==0 && dist[v]<=min) {
                min=dist[v];
                minind=v;
            }
        }
        return minind;
    }
//    static  boolean isReachable( int R, int E){
//        ArrayList<Integer> temp;
//
//    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int q=sc.nextInt();
        int e=sc.nextInt();
        //stores information about the edge
        edge edges[]=new edge[n-1];
        //graph as adj matrix
        long graph[][]= new long[n][n];
        for(int i=0;i<n-1;i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            graph[u-1][v-1]=w;
            graph[v-1][u-1]=w;
            edges[i]=new edge(u-1,v-1,w);
        }
        //to store vertices with extra capacities
        int extra[] = new int[s];
        for(int i=0;i<s;i++) {
            extra[i] = sc.nextInt();
        }
        int prevx=-1;
        for(int i=0;i<q;i++) {
//            int flag=0;
            if(prevx!=-1) {
                graph[edges[prevx-1].src][edges[prevx-1].dest]=edges[prevx-1].weight;
                graph[edges[prevx-1].dest][edges[prevx-1].src]=edges[prevx-1].weight;
            }
            long dist[]=new long[n];
            int spt[]=new int[n];
            for(int j=0;j<n;j++) {
                dist[j]=Long.MAX_VALUE;
            }
            int x = sc.nextInt();
            int r = sc.nextInt();
            dist[r-1]=0;
            graph[edges[x-1].src][edges[x-1].dest]=0;
            graph[edges[x-1].dest][edges[x-1].src]=0;
            prevx=x;
            // just find if there is a path between r and e
            // if yes return escaped
            // else return 0
            for(int count=0;count<n-1;count++) {
                int u=mindist(dist,spt);
                spt[u]=1;
                for(int v=0;v<n;v++) {
                    if(spt[v]==0 && graph[u][v]!=0 && dist[u]!=Long.MAX_VALUE && dist[u]+graph[u][v]<dist[v])
                        dist[v]=dist[u]+graph[u][v];
                }
            }
//            long min=Long.MAX_VALUE;
//            for(int j=0;j<s;j++) {
//                if(min>dist[extra[j]-1])
//                    min=dist[extra[j]-1];
//            }
            if(spt[e-1]==1) {
                System.out.println("escaped");
            }
//            else if(min==Long.MAX_VALUE)
//                System.out.println("oo");
            else {
                System.out.println("0");
            }
        }
    }
}