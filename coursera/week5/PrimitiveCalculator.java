package coursera.week5;
import java.util.*;

public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
//        static long minOperations(long n)
//        {
//            // To store the count of operations
//            long count = 0;
//
//            // To store the digit
//            long d = 0;
//
//            // If n is already then no
//            // operation is required
//            if (n == 1)
//                return 0;
//
//            // Extract all the digits except
//            // the first digit
//            while (n > 9)
//            {
//
//                // Store the maximum of that digits
//                d = Math.max(n % 10, d);
//                n /= 10;
//
//                // for each digit
//                count += 10;
//            }
//
//            // First digit
//            d = Math.max(d, n - 1);
//
//            // Add the value to count
//            count += Math.abs(d);
//
//            return count - 1;
//        }

        // Driver code

        List<Integer> sequence = new ArrayList<Integer>();
        while (n >= 1) {
            sequence.add(n);
            if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
        }
        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
//        System.out.println(minOperations(n));
        // System.out.println(sequence.size() - 1);
        // for (Integer x : sequence) {
        // System.out.print(x + " ");
        // }

    }
}

