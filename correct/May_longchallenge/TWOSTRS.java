package correct.May_longchallenge;
//                                #TLE
import java.io.IOException;
import java.util.*;

public class TWOSTRS {
    public static String[] SubString(String str)
    {
        int n = str.length();
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                array.add(str.substring(i, j));
            }
        }
        return array.toArray(new String[array.size()]);
    }
    public static void main(String[] args)throws IOException {
        try{
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i <T ; i++) {
                s.nextLine();
                String A = s.nextLine();
                String B = s.nextLine();
                int N =s.nextInt();
                HashMap<String, Integer> buy = new HashMap<>();
                for (int j = 0; j <N ; j++) {
                    s.nextLine();
                    String b = s.next();
                    int x = s.nextInt();
                    buy.put(b,x);
                }
                String[] A_sub = SubString(A);
                String[] B_sub = SubString(B);
                HashMap<String,Integer>final_A_B = new HashMap<>();
                for (int j = 0; j <A_sub.length ; j++) {
                    for (int k = 0; k <B_sub.length ; k++) {
                        String m = A_sub[j] + B_sub[k];
                        final_A_B.put(m,0);
                    }
                }
                int max = 0;
                for (String l:final_A_B.keySet()){
                    for (int j = 0; j <l.length() ; j++) {
                        for (int k = j+1; k <=l.length() ; k++) {
                            for (String h : buy.keySet()) {
                                if (l.substring(j, k).equals(h)) {
                                    final_A_B.put(l, final_A_B.get(l) + buy.get(h));
                                    if(max < final_A_B.get(l)) max = final_A_B.get(l);
                                }
                            }
                        }
                    }
                }

//                System.out.println(final_A_B.values());
                System.out.println(max);
            }

        }
        catch (Exception e) {
            return;
        }
    }
}
