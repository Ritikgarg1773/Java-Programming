package correct.June_longchallenge;
//                        #CORRECT
import java.io.IOException;
import java.util.Scanner;

public class CHFICRM {
    public static void main(String[] args) throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int n = s.nextInt();
                int[] array = new int[n];
                long coins_5 = 0;
                long coin_10 = 0;
                int flag = 1;
                for (int j = 0; j <n ; j++) {
                    array[j] = s.nextInt();
                }
                if (array[0] != 5) {
                    System.out.println("NO");
                }
                else {
                    coins_5+=1;
                    for (int j = 1; j < n; j++) {
//                        System.out.print(array[j] + " -> ");
                        if (array[j] == 5) {
                            coins_5 += 1;
                        }
                        else if (array[j] == 10) {
                            if (coins_5 >= 1) {
                                coins_5 -= 1;
                                coin_10+=1;
                            } else {
                                flag = 0;
                                break;
                            }
                        }
                        else if (array[j] == 15) {
                            if(coin_10>=1){
                                coin_10 -= 1;
                            }
                            else if (coins_5 >= 2) {
                                coins_5 -= 2;
                            }
                            else {
                                flag = 0;
                                break;
                            }
                        }
//                        System.out.println(coins_5 +" " + coin_10);
                    }
                    if (flag == 0) System.out.println("NO");
                    else System.out.println("YES");
                }
            }
        }
        catch (Exception e){
            return;
        }
    }
}
