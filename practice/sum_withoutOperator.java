package practice;

public class sum_withoutOperator {
    public static int sumOfTwoIntegers(int a, int b) {
        while (b != 0) {
            int carry = a & b; // do AND get the carry bit
            a = a ^ b; // do XOR to get the sum of bits
            System.out.println(a +" " + carry);
            b = carry << 1;
            System.out.println(b);
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        System.out.println(sumOfTwoIntegers(a,b));
    }
}
