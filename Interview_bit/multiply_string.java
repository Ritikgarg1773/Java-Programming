package Interview_bit;

import java.math.BigInteger;
//                    #CORRECT

public class multiply_string {
    public String multiply(String A, String B) {
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        a = a.multiply(b);
        return a.toString();
    }
}

