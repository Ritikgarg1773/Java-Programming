package correct.March_longchallenge.miscelleaneous;
// This is the normal recursion code for the problem. Here we are not able to tell the number of
// distinct ways i.e number of combinations. We are returning the number of Permutations.
import java.util.Scanner;

public class Main {
    static int counter = 0;
    static int k =0;
    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        Fun(arr,x,0);
        System.out.println(counter);
    }

    private static void Fun(int[] arr, int x,int coin) {
        if (x < 0){
            return ;
        }
        if (x == 0){
            counter++;
            System.out.println();
            return;
        }
        for (int i = coin; i < arr.length; i++) {
//            System.out.println(x-arr[i] + " " + x + " " + i);
            System.out.print(i+1 + " ");
             Fun(arr,x-arr[i],i);
//            System.out.print(arr[i] + " ");
        }
        return ;
    }
}
