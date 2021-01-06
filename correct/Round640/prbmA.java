package correct.Round640;
//                            #CORRECT
import java.util.ArrayList;
import java.util.Scanner;

public class prbmA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T= s.nextInt();
        for (int i = 0; i < T; i++) {
            int n = s.nextInt();
            String a = Integer.toString(n);
            if(a.length()==1){
                System.out.println(1);
                System.out.println(n);
            }
            else {
                ArrayList<Integer> array = new ArrayList<>();
                array.add(a.charAt(0)-'0');
                for (int j = 1; j <a.length() ; j++) {
                    if (a.charAt(j)!='0'){
                        array.add(a.charAt(j) - '0');
                    }
                    else array.add(0);
                }
                int count = 0;
                for (int j = 0; j <array.size(); j++) {
                    array.set(j, (int) (array.get(j)*Math.pow(10,array.size()-j-1)));
                    if (array.get(j) !=0) count++;
                }
                System.out.println(count);
                for (int j = 0; j <array.size() ; j++) {
                    if (array.get(j)!=0) System.out.print(array.get(j) +" ");
                }
//                int result = 0;
//                while (n>0){
//                    if (n%10 != 0)
//                    result = (n%10);
//                    array.add(result);
//                    result = result*10;
//                    n = n/10;
//                }
            }
        }
    }
}
