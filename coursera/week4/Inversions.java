package coursera.week4;
import java.util.*;

public class Inversions {

    // private static long getNumberOfInversions(int[] a, int[] b, int left, int right) {
    //     long numberOfInversions = 0;
    //     if (right <= left + 1) {
    //         return numberOfInversions;
    //     }
    //     int ave = (left + right) / 2;
    //     numberOfInversions += getNumberOfInversions(a, b, left, ave);
    //     numberOfInversions += getNumberOfInversions(a, b, ave, right);
    //     //write your code here
    //     return numberOfInversions;
    // }
    static int getInvCount(int[] arr,int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;

        return inv_count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        System.out.println(getInvCount(a, a.length));
    }
}


