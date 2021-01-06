package correct.JulyLongChallenge;
//                            #CORRECT
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class PTMSSNG {
    public static void main(String[] args)throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int N = s.nextInt();
                HashSet<Long> A = new HashSet<>();
                HashSet<Long> B = new HashSet<>();
                for (int j = 0; j <4*N-1 ; j++) {
                    long a = s.nextLong();
                    long b = s.nextLong();
                    if(A.contains(a)){
                        A.remove(a);
                    }
                    else{
                        A.add(a);
                    }
                    if(B.contains(b)){
                        B.remove(b);
                    }
                    else{
                        B.add(b);
                    }
                }
//                System.out.println(A);
//                System.out.println(B);
                for(long a : A){
                    System.out.print(a +" ");
                }
                for(long b : B){
                    System.out.print(b);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            return;
        }
    }
}
