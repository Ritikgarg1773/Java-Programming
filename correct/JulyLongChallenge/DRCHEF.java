package correct.JulyLongChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class DRCHEF {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        ArrayList<Long> s = new ArrayList<>();
        long c = in.nextLong();
        long counter = 0;
        s.add(c);
        for(int i = 1; i < N; i++){
            long x = in.nextLong();
            if(x <= c){
                counter++;
                continue;
            }
            s.add(x);
            c = x;
        }
        System.out.println(s);
        int size = s.size();
        while(size>0) {
            counter++;
            int a = lowerBound(s, X);
            System.out.println(a +" -> loweBound index");
//            s.set(s.get(a),(s.get(a)-X)*2);
            X = X*2;
            if (s.get(a) == 0){
                s.remove(s.get(a));
                size--;
            }
            System.out.println(s);
        }
        System.out.println(counter);
    }
    static int lowerBound(ArrayList<Long> s , long X){
        // to get the lower bound of the element
        long M = X;
        if(s.get(0) >= M)return 0;
        else if(s.get(s.size()-1) < M)return s.size()-1;
        else return getIndex(s,search(s, M, 0, s.size()-1));
    }
    static int getIndex(ArrayList<Long> s, Long element){
        for (int i = 0; i < s.size(); i++) {
            if(s.get(i) == element)return i;
            break;
        }
        return -1;
    }
    static long search(ArrayList<Long> s, long M, int l, int r){
//        PriorityQueue<Integer> q = new PriorityQueue<>();

        int mid = (l+r)/2;
        if(s.get(mid) >= M && (mid == 0 || s.get(mid-1) < M))return s.get(mid);
        else if(s.get(mid) < M)return search(s, M, mid+1, r);
        else return search(s,M, l,mid-1);

    }
}
