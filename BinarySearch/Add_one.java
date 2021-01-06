package BinarySearch;

import java.math.BigInteger;
import java.util.Arrays;

public class Add_one {
    public static int[] solve(int[] nums) {
        // Write your code here
        int a = 0;
        for (int i = 0; i <nums.length-1 ; i++) {
            a +=nums[i]*10;
            System.out.println(a);
        }
        a+=nums[nums.length-1]+1;
//        System.out.println(a);
        int[]digits = Integer.toString(a).chars().map(c -> c-'0').toArray();
        return digits;
    }
    public static void main(String[] args) {
        int[] num = {1,9,1};
        System.out.println(Arrays.toString(solve(num)));
    }
}
