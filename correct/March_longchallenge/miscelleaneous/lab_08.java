package correct.March_longchallenge.miscelleaneous;
//                        #CORRECT
import java.util.Scanner;

public class lab_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        long[] array = new long[T];
        long[] food_packets = new long[T];
        for (int i = 0; i <T ; i++) {
            array[i] = s.nextInt();
            food_packets[i] = 1;
        }
        for (int i = 1; i <T ; i+=1) {
            if (array[i] > array[i-1]) food_packets[i] = food_packets[i-1]+ 1;
        }
        long counter = food_packets[T-1];

        for (int i = T-2; i >=0 ; i--) {
            long new_pac = 1;
            if (array[i] > array[i+1]) new_pac = food_packets[i+1] +1;
            counter+= Math.max(new_pac,food_packets[i]);
            food_packets[i] = new_pac;
        }
        System.out.println(counter);

    }
}
