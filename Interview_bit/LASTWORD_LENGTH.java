package Interview_bit;

import java.util.Scanner;

public class LASTWORD_LENGTH {
    public static int lengthOfLastWord(final String A) {
        String[] a = A.split(" ");
        if (a.length == 0) return 0;
        String b = a[a.length-1];
        return b.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(lengthOfLastWord(a));
    }
}
