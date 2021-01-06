package BinarySearch;

import java.util.Arrays;
import java.util.LinkedList;

public class practicce {
//    public static int[] solve(int[] lst) {
//        // Write your code here
//        int[] array = new int[lst.length];
//        for(int i =0;i<lst.length;i++){
//            int count = 0;
//            for(int j = 0; j<=i ;j++){
//                System.out.println(lst[j] + " " + lst[i]);
//                if(lst[j] <= lst[i]){
//                    count++;
//                }
//            }
//            array[i] = count;
//        }
//        return array;
//    }
public static int solve(int nums) {
    // Write your code here
//    #TLE;
    int count = 0;
    StringBuilder s = new StringBuilder(Integer.toString(100));
    for (int i = s.length() - 1; i >= 0; i--) {
        StringBuilder t = s.deleteCharAt(i);
        System.out.println(t);
        s = s.insert(0, t);
        System.out.println(s);
//        Integer.parseInt(s.toString());

    }
    LinkedList<Integer> ll = new LinkedList<>();

    return -1;
}

//    for(int i=0;i< nums.length-1;i++){
//        for(int j =i+1;j< nums.length;j++){
//            if((nums[i] + nums[j])%2 ==1){
//                System.out.println(nums[i] + " "+nums[j]);
//                count++;
//            }
//        }
//    }
//    return count;
//}

    public static void main(String[] args) {
//        int[][] intervals = new int[100][100];
//        int s1 = intervals.length;
        int[] array = {2,2,1};
        System.out.println(solve(01));
    }
}
