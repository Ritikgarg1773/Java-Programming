package BinarySearch;

import java.math.BigInteger;
import java.util.*;

public class Solution {
//    public static String solve(String s) {
//        // Write your code here
//        s.toUpperCase()''
//        HashSet<Character> check = new HashSet<>();
//        StringBuilder a = new StringBuilder(s);
//        a.setCharAt();
//        int count= 0;
//        System.out.println(Arrays.toString(check.toArray()));
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == ' ' ) count++;
//        }
//        System.out.println(count);
//        while (a.charAt(0) == ' ') {
////            System.out.println(a.charAt(' ') + a.length());
////            System.out.println(true);
//            a.deleteCharAt(0);
////            a.replace(0,1,"");
//        }
//        System.out.println(a);
//        while (a.charAt(a.length()-1)== ' ') {
//            a.deleteCharAt(a.length() - 1);
//        }
//        System.out.println(a);
//        int len = a.length();
//        for (int i = 0; i <len-1 ; i++) {
//            if (a.charAt(i) == ' ' && a.charAt(i+1) == ' ') a.deleteCharAt(i);
//            i--;
//            len--;
//        }
//        return a.toString();
//    }
//public String solve(String[] words) {
//    // Write your code here
//    String s= "";
//    int val = words[0].length();
//    for(int i =0;i<words.length;i++){
//        s+=words[i];
//    }
//    s = s.toLowerCase();
//    StringBuilder s1 = new StringBuilder(s);
//    s1.setCharAt(val,(char)('A' + (s1.charAt(val) - 'a') +1));
//    ArrayList<Integer> s2 = new ArrayList<>();
//    s2.
//    int m = (int) Math.sqrt(100);
//    s = s1.toString();
//    return s;
//}
    public static int solve1(int n) {
        // Write your code here

        String s ="";
        StringBuilder a = new StringBuilder(s);
        a.deleteCharAt(0);
        a.charAt(0);
        a.insert(0,'a');
        return (int) (2 * (n+1) - Math.floor((1 + Math.sqrt(8 * (n+1) - 7))/2));

    }

    public static int[][] solve1(int[] fighters, int[][] bosses) {
            // Write your code here
        int fi = 0;
        for (int i = 0; i <fighters.length ; i++) {
            if (fighters[i] == 1) fi++;
        }
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i <bosses.length ; i++) {
            int bo = 0;
            for (int j = 0; j <bosses[i].length ; j++) {
                if (bosses[i][j] == 1){
                    bo ++;
                }
            }
            if (bo >= fi){
                ArrayList<Integer> v = new ArrayList<>();
                for (int j = 0; j <bosses[i].length ; j++) {
                    v.add(bosses[i][j]);

                }
                g.add(v);
            }
        }
        int[][] intArray = g.stream().map(  u  ->  u.stream().mapToInt(i->i).toArray()  ).toArray(int[][]::new);
//        System.out.println(Arrays.deepToString(g.toArray()));
        return intArray;
    }
    public static String solve2(String s) {
        // Write your code here
        StringBuilder a= new StringBuilder(s);
        int len = s.length();
        int i = 0;
        while (i<len){
            if (a.charAt(i) == '<' && a.charAt(i+1) == '-'){
                a.deleteCharAt(i);
                a.deleteCharAt(i);
                if (i > 0) {
                    a.deleteCharAt(i - 1);
                    i--;
                }
                len-=3;
            }
            else i++;
        }

//        System.out.println(a);
        return a.toString();
    }
    public static boolean solve1(int n, int[] convention) {
        // Write your code here
        int count =0 ;
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i <convention.length ; i++) {
            b.add(convention[i]);
        }
        int len = b.size();
        for (int i = 1; i <len-1 ; i++) {
            if (b.get(i-1) == 0 && b.get(i) == 1 && b.get(i+1) ==0) {
                b.remove(i);
                b.remove(i);
                if (i>0) {
                    b.remove(i - 1);
                    i--;
                }
                len-=3;

            }
            else i++;
        }
        if (b.get(0) == 1 && b.get(1) == 0){
            b.remove(0);b.remove(0);
        }
        if (b.get(b.size()-1) == 1 && b.get(b.size()-2) == 0) {
            b.remove(b.size()-1);
            b.remove(b.size()-1);
        }
        for (int i = 0; i <b.size() ; i++) {
            if (b.get(i) == 0){
                count++;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        int a = (int) Math.pow(2,Math.ceil(Math.log(2)/Math.log(2)));
        a+=3%(Math.pow(10,9)+7);
        if (count>0) return true;
        return false;
    }
    public static int solve22(int[] nums, int k) {
        // Write your code here
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            System.out.println(Math.ceil(Math.log(nums[i])/Math.log(2)));
            nums[i] = (int) Math.pow(2,Math.ceil(Math.log(nums[i])/Math.log(2)))-1;
        }
        System.out.print(Arrays.toString(nums));
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]%(Math.pow(10,9)+7);
        }
        return sum;
    }
    class LLNode {
    int val;
    LLNode next;
  }
    public static boolean solve3(int[] array) {
        // Write your code here
//        ArrayList<Integer> array = new ArrayList<>();
//        LLNode curr = node;
//        while(curr!=null){
//            array.add(curr.val);
//            curr=curr.next;
//        }
        System.out.println(Arrays.toString(array));
        for(int i =0;i<array.length/2;i++){
            if(array[i]!=array[array.length-1-i])return false;
        }
        return true;
    }
    public void solve11(int[] nums) {
        // Write your code here
        int[] array = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            array[nums[i] - 1]++;
        }
//        Arrays.sort(array, (o1, o2) -> o2-o1);
//        Arrays.sort(array, (Comparator<Object>) (o1, o2) -> o2-o1);
//        Arrays.sort(array,(o1,o2) -> o2 - o1);
        BigInteger a = new BigInteger("1000");

        //        a.toString();
//        int[] arr = new int[nums.length];
//        int k = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i]; j++) {
//                arr[k] = j + 1;
//                k++;
//            }
//        }
//        return {0,1};
//        int a = Integer.parseInt("100",2);

    }
    public int solve(int[] nums) {
        // Write your code here
        BigInteger sum = BigInteger.ZERO;
        // BigInteger len = BigInteger.valueOf(nums.length);
        BigInteger mod_val = BigInteger.valueOf(1000000000+7);
        for(int i=0;i<nums.length;i++){
            BigInteger a = BigInteger.valueOf(nums.length-i);
            BigInteger b = BigInteger.valueOf(i+1);
            BigInteger val = BigInteger.valueOf(nums[i]);
            a = a.multiply(b);
            val = val.multiply(a);
            sum = sum.add(val);
            // sum+=nums[i]*((nums.length-i)*(i+1))%(1000000000+7);
            // sum %= (1000000000+7);
            System.out.println(sum);
        }
        sum = sum.mod(mod_val);
        return sum.intValueExact();
    }
    public String solve(String text, String[] patterns) {
        // Write your code here
//        The approach to this question is similar to merging overlapping intervals.
//The solution can be divided into '' parts:
//1
//Find the [start,end] of each element in the list of patterns that occurred in text. This "find" needs to take care of overlapping occurences. Append this [start,end] to a common list.
//Once all the elements in patterns are checked, the common list will have the intervals ready. Sort this list based on the value of "start".
//Now the remaining solution is just to merge overlapping intervals. You can use a stack to merge and get a resulting list of intervals.
//Once the stack is ready, start inserting <b> and </b> in the original string "text" and use a counter to get the new position of insertion, as actual string is getting modified as we go along.
        StringBuilder s = new StringBuilder(text);
        String b ="<b>";
        String b1 = "</b>";
        for(int i =0;i<patterns.length;i++){
            int len = patterns[i].length();
            int next = text.indexOf(patterns[i]);
//            int t=0;
            while(next>=-1&&next<s.length()){
                s.insert(next,b);
                s.insert(next+len+3,b1);
                text = s.toString();
//                t=next+1;
                next = s.indexOf(patterns[i], next+7);

            }
        }
        System.out.println(s.toString());
        String v = "</b><b>";
        text = text.replace(v,"");
        System.out.println(text);
        return text;
    }
    public int solve(int n) {
        // Write your code here
        int t = 0;
        int v = 0;
        BigInteger c = fact(n);
        while(c.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0){
            c = c.divide(BigInteger.valueOf(2));
            t++;
        }
        while(c.mod(BigInteger.valueOf(5)).compareTo(BigInteger.ZERO) == 0){
            c = c.divide(BigInteger.valueOf(5));
            v++;
        }
        return Math.min(t,v);
    }
    private BigInteger fact(int c){
        BigInteger a = BigInteger.valueOf(1);
        for(int i =1;i<c;i++){
            BigInteger b = BigInteger.valueOf(1);
            a = a.multiply(b);
        }
        if(c == 0)return BigInteger.valueOf(1);
        return a;
    }
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        String b = s.nextLine();
        int[] f = {185, 17, 15, 22, 151, 100, 42, 106, 36, 94, 32, 153, 12, 6, 14, 92, 134, 84, 140, 179, 131, 118, 175, 146, 3, 120, 66, 173, 161, 163, 159, 154, 63, 26, 193, 156, 144, 8, 16, 4, 124, 170, 125, 93, 20, 158, 128, 67, 13, 136, 172, 65, 167, 61, 1, 47, 168, 199, 60, 133, 82, 33, 121, 149, 138, 108, 157, 25, 90, 2, 18, 83, 141, 123, 52, 0, 38, 198, 29, 127, 49, 147, 96, 87, 79, 58, 164, 41, 27, 104, 53, 186, 39, 135, 72, 75, 183, 117, 113, 110, 152, 190, 77, 103, 148, 137, 197, 37, 166, 54, 98, 184, 97, 109, 56, 55, 62, 176, 139, 189, 10, 178, 89, 187, 194, 129, 95, 171, 181, 155, 111, 81, 101, 50, 107, 122, 40, 34, 69, 23, 80, 78, 162, 165, 169, 68, 74, 188, 115, 51, 19, 99, 35, 7, 31, 143, 160, 21, 192, 132, 24, 5, 145, 71, 130, 191, 174, 76, 116, 30, 70, 180, 46, 88, 177, 195, 9, 142, 105, 86, 57, 126, 28, 73, 48, 114, 64, 150, 11, 59, 45, 112, 91, 102, 182, 85, 43, 196, 119, 44, 44, 119, 196, 43, 85, 182, 102, 91, 112, 45, 59, 11, 150, 64, 114, 48, 73, 28, 126, 57, 86, 105, 142, 9, 195, 177, 88, 46, 180, 70, 30, 116, 76, 174, 191, 130, 71, 145, 5, 24, 132, 192, 21, 160, 143, 31, 7, 35, 99, 19, 51, 115, 188, 74, 68, 169, 165, 162, 78, 80, 23, 69, 34, 40, 122, 107, 50, 101, 81, 111, 155, 181, 171, 95, 129, 194, 187, 89, 178, 10, 189, 139, 176, 62, 55, 56, 109, 97, 184, 98, 54, 166, 37, 197, 137, 148, 103, 77, 190, 152, 110, 113, 117, 183, 75, 72, 135, 39, 186, 53, 104, 27, 41, 164, 58, 79, 87, 96, 147, 49, 127, 29, 198, 38, 0, 52, 123, 141, 83, 18, 2, 90, 25, 157, 108, 138, 149, 121, 33, 82, 133, 60, 199, 168, 47, 1, 61, 167, 65, 172, 136, 13, 67, 128, 158, 20, 93, 125, 170, 124, 4, 16, 8, 144, 156, 193, 26, 63, 154, 159, 163, 161, 173, 66, 120, 3, 146, 175, 118, 131, 179, 140, 84, 134, 92, 14, 6, 12, 153, 32, 94, 36, 106, 42, 100, 151, 22, 15, 17, 185};
//        int k = 1;
//        int[][] b = {{0,0,0},{0,0,1},{0,1,1},{1,1,1}};
//        String[] d = {"ahartphgogc", "b", "cjdbwgtfpzkgqo", "ctwvvgaptbdb", "fegbttfs", "galqsomfcojqoez", "gkvlftoipswly", "jqwvkfs", "kcbvqm", "lfjetsxrsyqmde", "lfrhhcqfan", "lxejh", "n", "pfrpvpsvvo", "plfqu", "pokvi", "pthzz", "q", "qmuwbsylywonvy", "rz", "szny", "tkozzaycsotzs", "tmyzivwjo", "ucubtbakpym", "uhitqivmixd", "uqkddqbmtgx", "vjfhogsvn", "wj", "ymkcggkq", "zbzgrwtguci", "ztpkkbl", "zyzhndnbf"};
        System.out.println(solve3(f));
    }
}
