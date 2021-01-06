package Interview_bit;
import java.util.*;
import java.util.regex.Pattern;

public class solution1 {
    static int fact(int n)
    {
        return (n <= 1) ? 1 : n * fact(n - 1)%1000003;
    }

    static int findRank(String A)
    {
        String s = A;
        int answer = 0;
        int n =s.length();
        for (int i = 0; i < n-1; i++) {
            int c =0;
            for (int j = i+1; j <n ; j++) {
                if (s.charAt(j) < s.charAt(i))c++;
            }
            answer+= (c*fact(n-i-1))%1000003;
        }
        return (answer+1)%1000003;
    }
    public static int titleToNumber(String A) {
        int answer = 0;
        for (int i = A.length()-1; i >= 0 ; i--) {
            answer += (A.charAt(i) - 'A' + 1) * Math.pow(26,A.length() - i - 1);
        }
        return answer;
    }
    public static String convertToTitle(int A) {
        String s = "";
        int counter = 0;
        while ( A > 0){
            counter = A % 26;
            char a ;
            if (counter == 0) {
                a = 'Z';
                s = a + s;
                A = A / 26 -1;
            }
            else {
                a = (char) ('A' + counter - 1);
                s = a + s;
                A = A / 26;
            }
        }
        return s;
    }

    public static void arrange(ArrayList<Integer> a) {
        // O(n) space complexity
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i <a.size() ; i++) {
            b.add(0);
        }
        for (int i = 0; i <a.size() ; i++) {
            int s = a.get(a.get(i));
//            System.out.println(s);
            b.set(i,s);
//            a.set(i, s);
        }
        a = b;
        System.out.println(Arrays.toString(a.toArray()));
//        System.out.println(Arrays.toString(b.toArray()));
    }
    public static int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0 && A.get(i) <= n)
                present[A.get(i)] = true;
        }
        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;
        return n + 1;
    }

    public static ArrayList<Integer> repeatedNumber1(final List<Integer> A) {
        int[] a = new int[A.size()];
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i <A.size() ; i++) {
            a[A.get(i) - 1] +=1;
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == 2){
                System.out.print((i+1) +" ");
                b.add(i+1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                System.out.println((i+1));
                b.add(i+1);
            }
        }
        return b;
    }
    public static int repeatedNumber2(final List<Integer> A) {
        System.out.println(Arrays.toString(A.toArray()));
        int slow = A.get(0);
        int fast = A.get(A.get(0));
        while(slow!= fast){
            slow = A.get(slow);
            fast = A.get(A.get(fast));
            System.out.println(slow + " " + fast);
        }
        fast = 0;   
        while (slow!= fast){
            slow = A.get(slow);
            fast = A.get(fast);
            System.out.println(slow + " " + fast);
        }
        if (slow == 0)return -1;
        return slow;
    }
    public static int repeatedNumber(final List<Integer> a) {
        int n = a.size();
        int number1 = Integer.MAX_VALUE;
        int number2 = Integer.MAX_VALUE;
        int count1= 0;
        int count2 = 0;
        for (int i = 0; i <n ; i++) {
            if (count1>0 && a.get(i) == number1){
                count1++;
            }
            else if (count2>0 && a.get(i) == number2) {
                count2++;
            }
            else if (count1 == 0){
                number1 = a.get(i);
                count1 =1;
            }
            else if (count2 == 0){
                number2 = a.get(i);
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        if (count1 == 0 && count2 ==0 ){
            return -1;
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) == number1) count1++;
            else if (a.get(i) == number2) count2++;
        }
        if (count1 > n/3) return number1;
        else if (count2 > n/3) return number2;
        else return -1;
     }

     public static class Interval {
         int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }
    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for (int i = 0; i <A.size()-1 ; i+=2) {
            int tem = A.get(i);
            A.set(i,A.get(i+1));
            A.set(i+1, tem);
        }
        return A;
    }
    public static boolean solve(int n) {
        // Write your code here
        int flag = 1;
        String s = Integer.toBinaryString(n);

        if(s.charAt(0) == '1') {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != '0') {
                    flag = 0;
                }
            }
        }
            else flag =0;
        if(flag == 0) return false;
        return true;
    }
    public static int maximumGap(final List<Integer> A) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.sort(A);
        if (A.size() == 1) return 0;
        for (int i = 0; i <A.size() ; i++) {
            for (int j = i; j <A.size() ; j++) {
//                System.out.println(A.get(i) +" " + A.get(j) + " " + (j-i));
                if (A.get(j) >= A.get(i)){
                    a.add(j-i);
                }
            }
        }
        Collections.sort(a);
        if (a.size()>0)
        return a.get(a.size()-1);
        return -1;
    }
    public int maximumGap1(List<Integer> A) {
        Collections.sort(A);
        int max =0;
        for(int i = 0;i<A.size()-1;i++){
            if(A.get(i) - A.get(i+1)>max) max =A.get(i) - A.get(i+1);
        }
        return max;
    }
    public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i <A ; i++) {
            ArrayList<Integer> b = new ArrayList<>();
            for (int j = 0; j <A ; j++) {
                b.add(0);
            }
            a.add(b);
        }
        int[][] C = new int[A][A];
            for (int i = 0; i < A; i++) {
                for (int j = 0; j < A; j++) {
                    if (i == 0|| j==0 || i == A-1 || j == A-1){
                        C[i][j] = A;
                    }
//                    b.add(A);
                }
//                a.add(b);
            }
//            A--;
        System.out.println(Arrays.deepToString(a.toArray()));
        return a;
    }
    public static void main(String[] args) {
//        Interval i1 = new Interval(1,2);
//        Interval i2 = new Interval(3,5);
//        Interval i3 = new Interval(6,7);
//        Interval i4 = new Interval(8,10);
//        Interval i5 = new Interval(12,16);
//        ArrayList<Interval> intervals = new ArrayList<>();
//        intervals.add(i1);
//        intervals.add(i2);
//        intervals.add(i3);
//        intervals.add(i4);
//        intervals.add(i5);
//        Interval i6 = new Interval(4,9);
//
////        System.out.println(intervals.size());
////        insert(intervals,i6);
//        for (Interval i: intervals) {
////            System.out.println(intervals.size());
//            System.out.println(i.start +" "+i.end +" ->final");
//        }
        Scanner s = new Scanner(System.in);
//        String S = s.nextLine();
//        int[] a = {14, -17, -8, 23, 15, 22, 8, 9, 12, 5, 8, -24, -17};
//        String a = s.nextLine();
//        String b =     s.nextLine();
        int a = s.nextInt();
//        ArrayList<Integer> b = new ArrayList<>();
//        b.add(3);
//        b.add(2);
//        b.add(1);
        System.out.println(prettyPrint(a));
//        System.out.println(solve(a));
//        StringBuilder a = new StringBuilder(S);
//        String a = "";
//        int count = 1;
////        System.out.println(S);
//        int i = 0;
//        if(S == "") System.out.println(a);
//        for (i = 0; i <S.length()-1 ; i++) {
//            if (S.charAt(i)==S.charAt(i+1)){
////                System.out.println(S.charAt(i));
//                count++;
//            }
//            else{
//                a+=(Integer.toString(count));
//                a+=(S.charAt(i));
//                count= 1;
//            }
//        }
//        a+=(Integer.toString(count));
//        a+=(S.charAt(i));
//        System.out.println(a);
    }
}
