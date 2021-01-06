package coursera.week3;
import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int num_refill = 0;
        int current_refill = 0;
        int last_refill;

        while (current_refill <= stops.length-1 ){
            last_refill = current_refill;
            System.out.println(last_refill +"-> last refill");
            while ((current_refill < stops.length-1) && (stops[current_refill+1] - stops[last_refill] <= tank)){
                current_refill +=1;
            }
            if (current_refill == last_refill){
                return -1;
            }
            if (current_refill <= stops.length-1) {
                num_refill += 1;
                System.out.println(current_refill + " " + stops[current_refill]);
            }
            if (stops[current_refill + 1] + tank >= dist){
                return num_refill;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}

