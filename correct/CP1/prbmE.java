package correct.CP1;
//                        #CORRECT
import java.util.*;

public class prbmE {
    static class node{
        int data;
        int index;
        public node(int data, int index){
            this.index = index;
            this.data  = data;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] array = new int[n];
        Queue<node> queue = new PriorityQueue<>(n, new Comparator<node>() {
            @Override
            public int compare(node t1, node t2) {
                if (t1.data>t2.data)return 1;
                else if(t1.data == t2.data){
                        if(t1.index>t2.index)return 1;
                        else return -1;
                }
                return -1;
            }

        });
        int f = 0;
        while(f<n){
            int val = s.nextInt();
            node v = new node(val,f);
            queue.offer(v);
            f++;
        }
        for (int i = 0; i <k ; i++) {
            node v = queue.remove();
            v.data+=1;
            queue.offer(v);
        }
        int[] arr = queue.stream().mapToInt(i->i.data).toArray();
        int size = queue.size();
        for(int i =0;i<size;i++){
            node v = queue.poll();
            array[v.index] = v.data;
            size--;
            i--;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(array[i] +" ");
        }
    }

}
