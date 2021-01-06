package correct.March_longchallenge.codeforces;
//                    #CORRECT
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

 public class prbm230_A {
    public static class node{
          int x;
          int y;

        public node(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return x;
        }
        public  int getY(){
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int n = s.nextInt();
        ArrayList<node> x = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            node a = new node(x1,y1);
            x.add(a);
        }
//        System.out.println(K+" "+ n);
//        for (int i = 0; i <x.size() ; i++) {
//            System.out.println(x.get(i).getX());
//        }
        x.sort(Comparator.comparing(node::getX));
//        for (int i = 0; i <x.size() ; i++) {
//            System.out.println(x.get(i).getX() +" " +x.get(i).getY() );
//        }
        int  flag = 1;
        for (int i = 0; i <n ; i++) {
            if (K <= x.get(i).getX()){
                flag = 0;
//                System.out.println("NO");
            }
            else {
                K += x.get(i).getY();
            }
        }
        if (flag == 0){
            System.out.println("NO");
        }
        else System.out.println("YES");
    }
}
