package correct.round_0656;
//            #CORRECT
import java.util.Scanner;

public class prbmC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n  = s.nextInt();
            int[] array = new int[n];
//            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int a = s.nextInt();
                array[j] = (a);
            }
            int R=n-1;
            while(R>0&&array[R-1]>=array[R])R--;
            while(R>0&&array[R-1]<=array[R])R--;
            System.out.println(R);
        }
    }
//
//    private static int validate(int[] array, int counter) {
//        int n = array.length;
//        ArrayList<Integer> arr = new ArrayList<>();
//        int  i = counter;
//        int j = n-1;
//        while(i<j){
//            if(array[i]<=array[j]){
//                arr.add(array[i]);
//                i++;
//            }
//            else {
//                arr.add(array[j]);
//                j--;
//            }
//        }
////        System.out.println(arr);
//        if(checkIncreasing(arr)){
//            return counter;
//        }
//        else{
//            counter = validate(array,counter+1);
//        }
//        return counter;
//    }
//
//    private static boolean checkIncreasing(ArrayList<Integer> arr) {
//        for (int i = 0; i < arr.size()-1; i++) {
//            if(arr.get(i) > arr.get(i+1))return false;
//        }
//        return true;
//    }
}
