package Interview_bit;
//                        #CORRECT
import java.math.BigInteger;
import java.util.*;

public class solution {
//    static String answer = "";
    public static String largestNumber(final List<Integer> A) {
        String[] arr = new String[A.size()];
        for(int i= 0; i<A.size(); i++){
            arr[i]=String.valueOf(A.get(i));
        }

        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);

        return sb.toString();

    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();

        A.set(n-1,(A.get(n-1)+1)%10);
        int carry = 0;
        if (A.get(n-1) == 0) carry = 1;
        for (int i = n-2; i >=0 ; i--) {
            if (carry == 1){
                A.set(i, A.get(i) + 1);
                carry = A.get(i) / 10;
                A.set(i, A.get(i) % 10);
            }
        }
        if (carry==1){
            A.add(0,1);
        }
        while (A.get(0) == 0) A.remove(0);
        return A;
    }
    public static ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i <A ; i++) {
            a.add("");
        }
        for (int i = 0; i <A ; i++) {
            if ((i+1)%15 == 0){
                a.set(i,"FizzBuzz");
            }

            else if ((i+1)%5 == 0){
                a.set(i,"Buzz");
            }
            else if ((i+1)%3 == 0){
                a.set(i,"Fizz");
            }
            else {
                a.set(i,String.valueOf(i+1));
            }
        }
        return a;
    }
    public static  int power(int A){
        int flag = 0;
        if (A == 1) return 1;
        for (int i = 2; i*i <=A ; i++) {
//          // Tle aaya tha

//            int p = i;
//            while (p<=A){
//                p*=i;
//                if (p == A) flag = 1;

            double val = Math.log(A)/Math.log(i);
            if (val - (int)val < 0.00000001)flag = 1;
            }
        if (flag== 1) return 1;
        return 0;
    }

    public static int palindrome(int A){
        String a = String.valueOf(A);
        int flag = 1;
        for (int i = 0; i <a.length()/2 ; i++) {
            if (a.charAt(i) != a.charAt(a.length()-1-i)){
                flag = 0;
                break;
            }
        }
        if (flag == 0) return 0;
        return 1;
    }

    public static int reverse(int num){
        boolean negativeFlag = false;
        if (num < 0)
        {
            negativeFlag = true;
            num = -num ;
        }
        int prev_rev_num = 0, rev_num = 0;
        while (num != 0)
        {
            int curr_digit = num%10;
            rev_num = (rev_num*10) + curr_digit;
            if ((rev_num - curr_digit)/10 != prev_rev_num)
            {
                return 0;
            }
            prev_rev_num = rev_num;
            num = num/10;
        }

        return (negativeFlag)? -rev_num : rev_num;
    }

    public static long findRank(String A) {
        int length = A.length();
        int multiply =fact(length);
        long rank = 1;
        int countRight;
        for (int i = 0; i < length ; i++) {
            multiply/=length-i;
            countRight = findSmallerright(A,i,length-1);
            rank+= countRight*multiply;
        }
        return rank%1000003;
    }

    public static int findSmallerright(String a, int low, int high) {
    int countRight = 0;
        for (int i = low + 1; i <= high ; i++) {
            if (a.charAt(i)< a.charAt(low)) countRight++;
        }
        return countRight;
    }

    private static int fact(int length) {
        return (length<=1) ? 1: length*fact(length-1);
    }

    public static void main(String[] args) {
//        ArrayList<Integer> A  = new ArrayList<>();
//        A.add(0);A.add(0);A.add(0);
////        A.add(2);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);A.add(9);
//        System.out.println(Arrays.toString(A.toArray()));
//        System.out.println(Arrays.toString(plusOne(A).toArray()));
//        -1146467285
//        int a =-1146467285;
//        System.out.println(Arrays.toString(fizzBuzz(a).toArray()));
        System.out.println(findRank("DTNGJPURFHYEW" ));
    }
}
