package correct.done;

public class factorial {
    static int findTrailingZeros(int n)
    {
        // Initialize result
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

    public static void main(String[] args) {
        int n = 200;
        System.out.println(findTrailingZeros(n));
    }
}
