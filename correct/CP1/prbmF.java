package correct.CP1;
//                            #CORRECT
import java.math.BigInteger;
import java.util.Scanner;

public class prbmF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        for (int i = 0; i <t; i++) {
            String a =s.nextLine();
            String[] arr = a.split(" ");
//            long count = 0;
            BigInteger N = new BigInteger(arr[0]);
            BigInteger M = new BigInteger(arr[1]);
//            System.out.println(N +" "+M +" " +N.compareTo(M) );

            System.out.println(solve(N,M));
        }
    }
    private static BigInteger solve(BigInteger N, BigInteger M){
        if(N.compareTo(M)<0){
//            System.out.println(0);
            return BigInteger.ZERO;
        }
        BigInteger z = M.add(BigInteger.valueOf(163));
        BigInteger a1 = N.min(z);
        BigInteger j = M;
        while ((j.compareTo(a1) <1)){
            BigInteger x = BigInteger.valueOf(digitSum(j.toString()));
            if(j.subtract(x).compareTo(M)>=0){
                N = N.subtract(j);
                N = N.add(BigInteger.ONE);
//                System.out.println(N);
                return N;
            }
            j = j.add(BigInteger.ONE);
        }
        return BigInteger.ZERO;
    }
    private static int digitSum(String a){
        int sum = 0;
        for(int i=0;i<a.length();i++){
            sum+=a.charAt(i)-'0';
        }
        return sum;
    }
}
