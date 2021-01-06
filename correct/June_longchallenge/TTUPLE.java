package correct.June_longchallenge;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TTUPLE {
    static int flag = 1;
    static int count = 0;
    static int count1 = 0;
    static void checkArray(int a[], int b[], int n)
    {
        int operations = 0;
        int i = 0;

        // Loop to iterate over the array
        while (i < n) {

            // if both elements are equal
            // then move to next element
            if (a[i] - b[i] == 0) {
                i++;
                continue;
            }

            // Calculate the difference
            // between two elements
            int diff = a[i] - b[i];
            i++;

            // loop while the next pair of
            // elements have same difference
            while (i < n &&
                    a[i] - b[i] == diff) {
                i++;
            }

            // Increase the number of
            // operations by 1
            operations++;
        }

        // Print the number of
        // operations required
        System.out.println(operations);
    }
    public static void main(String[] args) throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                int[] set1 = new int[3];
                int[] set2 = new int[3];
                int size = 3;
                for (int j = 0; j <3 ; j++) {
                    set1[j] = s.nextInt();
                }
                for (int j = 0; j <3 ; j++) {
                    set2[j] = s.nextInt();
                }
//                checkArray(set1,set2,size);
                min_through_addition(set1,set2);
//                min_through_multiplication(set1, set2);
//                int v = Math.abs(1- 2);

            }
        }
        catch (Exception e){
            return;
        }
    }

    private static void min_through_multiplication(int[] set1, int[] set2) {
        for (int j = 0; j <3 ; j++) {
            set2[j] = set2[j] - set1[j];
        }
        if (set2[0] <0 && set2[1] <0 && set2[2] <0){
            flag = 0;
        }
//                System.out.println(Arrays.toString(set2));
        while (flag!=0){
            findmin(set2);
//                    System.out.println(Arrays.toString(set2));
        }
//        System.out.println(count);
        flag = 1;
        count = 0;
    }

    private static void min_through_addition(int[] set1, int[] set2) {
        for (int j = 0; j <3 ; j++) {
            set2[j] = set2[j] - set1[j];
        }
        if (set2[0] <0 && set2[1] <0 && set2[2] <0){
            flag = 0;
        }
//                System.out.println(Arrays.toString(set2));
        while (flag!=0){
            findmin(set2);
//                    System.out.println(Arrays.toString(set2));
        }
        System.out.println(count);
        flag = 1;
        count = 0;
    }

    private static void findmin(int[] set2) {
//        System.out.println(Arrays.toString(set2 )+"-> inside min " + flag);
        if (set2[0] == 0 && set2[1] == 0 && set2[2] == 0){
            flag = 0;
//            System.out.println(flag + " flag");
            return;
        }
        Arrays.sort(set2);
        int min = set2[0];
        if (set2[0] == 0){
            min = set2[1];
            if (set2[1] == 0){
                min = set2[2];
            }
        }
        for (int i = 0; i <3 ; i++) {
            if (set2[i]!=0){
                set2[i]-=min;
            }
        }
        count++;
    }
}
