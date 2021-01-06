package correct.March_longchallenge.miscelleaneous;
//                        #CORRECT
import java.util.Scanner;

public class prbm25A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i] = s.nextInt();
        }
        int e_count =0 ;
        int o_count = 0;
        if (array[0] %2 == 0){
            e_count++;
        }
        else o_count++;

        if (array[1]%2==0) e_count++;
        else o_count++;

        if (array[2]%2==0) e_count++;
        else o_count++;

        if (e_count>o_count){
            for (int i = 0; i < n; i++) {
                if (array[i]%2==1){
                    System.out.println(i+1);
                }
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                if (array[i]%2==0) System.out.println(i+1);
            }
        }
    }
}
