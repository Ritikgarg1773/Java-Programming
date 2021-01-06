package correct.March_longchallenge.codeforces;
//                        #CORRECT
import java.util.Scanner;

public class prbm439A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int counter = 2*(n-1);
        int joke_time = counter * 5;
        int sing_time = 0;
        int[] a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = s.nextInt();
            sing_time += a[i];
        }
        int total_time = sing_time+joke_time;
        if (total_time > d){
            System.out.println(-1);
        }
        else {
            joke_time+= (d - total_time);
            System.out.println(joke_time/5);
        }
    }
}
