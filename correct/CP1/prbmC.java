package correct.CP1;
//                    #CORRECT
import java.util.*;

public class prbmC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            long x = s.nextLong();
            HashSet<Long>set = new HashSet<>();
            while(x%2==0){
                set.add((long)2);
                x = x/2;
            }
            for (long j =3;j*j<=x;j+=2){
                while(x%j==0){
                    set.add(j);
                    x=x/j;
                }
            }
            if(x>=2){
                set.add(x);
            }
            List<Long> sortedList = new ArrayList<>(set);
            Collections.sort(sortedList);
//            System.out.println(sortedList);
            if(sortedList.size()!=2) System.out.println(-1);
            else {
                for(long j:sortedList) System.out.print(j+" ");
                System.out.println();
            }
        }
    }
}
