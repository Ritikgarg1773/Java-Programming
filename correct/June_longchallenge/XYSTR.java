package correct.June_longchallenge;
//                    #CORRECT
import java.io.IOException;
import java.util.Scanner;

public class XYSTR {
    public static void main(String[] args) throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            s.nextLine();
            for (int i = 0; i < T; i++) {
                long sum = 0;
                String S = s.nextLine();
//                StringBuilder a = new StringBuilder(S);
                for (int j = 0; j < S.length()-1; j++) {
                    if (S.charAt(j) == 'x'&&S.charAt(j+1) == 'y'){
                        sum+=1;
                        j++;
                    }
                    else if (S.charAt(j) == 'y'&& S.charAt(j+1) == 'x'){
                        sum+=1;
                        j++;
                    }
                }
                System.out.println(sum);
            }
        }
        catch (Exception e){
            return;
        }
    }
}
