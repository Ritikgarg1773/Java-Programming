package coursera.week2;

import java.util.ArrayList;

public class solution {
    static ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
    }

    public static void main(String[] args) {
//        ArrayList<Integer>  = new ArrayList<>();
        ArrayList<Integer> loca = new ArrayList<>();
        loca.add(5);
        loca.add(10);
        loca.add(2);
        loca.add(1);
//        A.add(loca);
//        ArrayList<Integer> loca1  = new ArrayList<>();
//        loca1.add(5);
//        loca1.add(6);
//        loca1.add(7);
//        A.add(loca1);

        ArrayList<Integer> B = performOps(loca);
        for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i) + " ");
        }
    }
}
