package correct.JulyLongChallenge;
//                    #CORRECT
import java.io.IOException;
import java.util.Scanner;

public class CRDGAME {
    public static void main(String[] args)throws IOException {
        try {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int n = s.nextInt();
                int[] A = new int[n];
                int[] B = new int[n];
                for (int j = 0; j < n; j++) {
                    A[j] = s.nextInt();
                    B[j] = s.nextInt();
                }
                for (int j = 0; j <n ; j++) {
                    A[j] = sumDigits(A[j]);
                }
                for (int j = 0; j <n ; j++) {
                    B[j] = sumDigits(B[j]);
                }
//                System.out.println(Arrays.toString(A));
//                System.out.println(Arrays.toString(B));
                int s1 = 0;
                int s2 = 0;
                for (int j = 0; j < n; j++) {
                    if(A[j]>B[j]){
                        s1+=1;
                    }
                    else if(A[j]<B[j]){
                        s2+=1;
                    }
                    else{
                        s1+=1;
                        s2+=1;
                    }
                }
                if(s1 > s2) System.out.println(0 + " " + s1);
                else if(s1 < s2 ) System.out.println(1 +" " + s2);
                else System.out.println(2+" " + s1);
            }
        }
        catch (Exception e){
            return;
        }
    }

    private static int sumDigits(int i) {
        String s = Integer.toString(i);
        int sum = 0;
        for (int j = 0; j <s.length() ; j++) {
            sum+=s.charAt(j) - '0';
        }
        return sum;
    }
}
