package correct.ALD_endsem;
//                    #CORRECT
import java.util.Scanner;

public class prbmB {
    public static int[] toggle(int[] array, int index){
        for (int i = index; i <array.length ; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] =0;
        }

        return array;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i] = s.nextInt();
        }
        int count = 0;
        if (array[0] == 0) count+=1;
        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i] != array[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
