package coursera.week5;
import java.util.Scanner;

public class ChangeDP {

    private static int getChange(int[] coins,int m, int V ) {
        //write your code here
        int table[] = new int[V + 1];

        table[0] = 0;

        for (int i = 1; i <= V; i++)
            table[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= V; i++)
        {
            for (int j = 0; j < m; j++)
                if (coins[j] <= i)
                {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }

        }
        return table[V];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int[] deno = {1,3,4};
        int m= deno.length;

        System.out.println(getChange(deno, m,V));

    }
}


