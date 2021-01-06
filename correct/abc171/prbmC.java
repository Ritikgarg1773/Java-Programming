package correct.abc171;
//                    #CORRECT
import java.util.Scanner;

public class prbmC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        String a = "";
        long counter = 0;
        while(n>0){
            counter= (n-1)%26;
            char a1 = (char)('a'+counter);
            a=a1+a;
            n = (n-1)/26;
        }
        System.out.println(a);
    }
}
