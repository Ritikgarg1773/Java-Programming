package correct.March_longchallenge.miscelleaneous;

public class variable_argumen {
    public static String add(int... a){
        int sum = 0;
        for (int i:a
             ) {
            sum+=i;
        }
        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        int a = 10;
        int b =20;
        System.out.println(add(a));
        System.out.println(add(a,b,a));
    }
}
