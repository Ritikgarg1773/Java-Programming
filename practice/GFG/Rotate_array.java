package practice.GFG;

import java.math.BigInteger;
import java.util.*;

public class Rotate_array {
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        long T = s.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i <T ; i++) {
            array.add(s.nextInt());
        }
//        Collections.reverse(array);
        array = plusOne(array);
        System.out.println(array);
    }
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
//        System.out.println(A);
        String s = "";
        for(int i :A){
            s+=Integer.toString(i);
        }
        BigInteger a = new BigInteger(s);
        a = a.add(BigInteger.ONE);
        s = a.toString();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            arrayList.add(s.charAt(i) - '0');
        }
        return arrayList;
    }
}
