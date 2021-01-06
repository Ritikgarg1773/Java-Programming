package correct.abc171;
//                        #CORRECT
import java.util.Scanner;

public class prbmE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x=0;
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length-1;i+=2){
            x = x^arr[i]^arr[i+1];
//            System.out.println(x + " " + arr[i] + arr[i+1]);
        }
//        System.out.println(x);
        for(int i =0;i<arr.length;i++){
            arr[i] = x^arr[i];
            System.out.print(arr[i] +" ");
        }
    }
}
