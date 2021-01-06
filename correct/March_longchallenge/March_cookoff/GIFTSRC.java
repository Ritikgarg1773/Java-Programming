package correct.March_longchallenge.March_cookoff;
//                        #CORRECT
import java.io.IOException;
import java.util.Scanner;

public class GIFTSRC {
    public static void main(String[] args)throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int j = 0; j < T; j++) {
                int N = s.nextInt();
                s.nextLine();
                StringBuilder a = new StringBuilder(s.nextLine());
                int x = 0;
                int y = 0;
                int l = a.length();
                for (int i = 0; i <l-1 ; i++) {
                    if (a.charAt(i) == 'L' && (a.charAt(i+1) == 'L' || a.charAt(i+1)== 'R')){
                        a.deleteCharAt(i+1);
                        i--;
                        l--;
                    }
                    else if (a.charAt(i) == 'R' && (a.charAt(i+1) == 'L' || a.charAt(i+1)== 'R')){
                        a.deleteCharAt(i+1);
                        i--;
                        l--;
                    }
                    else if (a.charAt(i) == 'U' && (a.charAt(i+1) == 'U' || a.charAt(i+1)== 'D')){
                        a.deleteCharAt(i+1);
                        l--;
                        i--;
                    }else if (a.charAt(i) == 'D' && (a.charAt(i+1) == 'U' || a.charAt(i+1)== 'D')){
                        a.deleteCharAt(i+1);
                        i--;
                        l--;
                    }
                }
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) == 'L'){
                        x-=1;
                    }
                    else if (a.charAt(i) == 'R') x+=1;
                    else if (a.charAt(i) == 'U') y+=1;
                    else if (a.charAt(i) == 'D') y-=1;
                }
                System.out.println(x + " " + y);

            }
        }
        catch (Exception E){
            return;
        }
    }
}
