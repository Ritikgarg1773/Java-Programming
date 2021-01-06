package correct.ALD_endsem;
//                    #CORRECT
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prbmC {
    static long tC2(long n){
        return  (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        int count1 = 0;
        for (int i = 1; i <S.length()-1 ; i++) {
            if (S.charAt(i-1) == S.charAt(i+1)) count1++;
        }
        long[] array = new long[S.length()];
        int count = 1;
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 1; i <S.length() ; i++) {
            if (S.charAt(i-1)!= S.charAt(i)) {
                output.add(count);
                count=1;
            }
            else {
                count++;
            }
        }
        output.add(count);
        System.out.println(Arrays.toString(output.toArray()));
        long sum = S.length() -output.size();
        System.out.println(sum);
        sum+= tC2(output.size());
        sum-=count1;
        System.out.println(sum);
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        ArrayList<Character> ch=new ArrayList<Character>();
//        ArrayList<Integer> val=new ArrayList<Integer>();
//        ch.add(s.charAt(0));
//        val.add(1);
//        for(int i=1;i<s.length();i++){
//            if(ch.get(ch.size()-1)==s.charAt(i)){
//                val.set(val.size()-1,val.get(val.size()-1)+1);
//            }
//            else{
//                ch.add(s.charAt(i));
//                val.add(1);
//            }
//        }
////        System.out.println(Arrays.toString(val.toArray()));
////        System.out.println(Arrays.toString(ch.toArray()));
//        long ans=tC2(ch.size());
//        ans+=s.length()-ch.size();
////        ans-=ch.size();
//        int count = 0;
//        for(int k=1;k<s.length()-1;k++){
//            if(s.charAt(k-1)==s.charAt(k+1)){
//                count++;
//            }
//        }
//        ans-=count;
//        System.out.println(ans);
    }
}
