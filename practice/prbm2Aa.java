package practice;
//					#CORRECT
import java.util.*;
class prbm2Aa{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i = 0;i<t;i++){
			int a = s.nextInt();
			ll.add(a);
		}
		int q = s.nextInt();
		for (int i = 0; i < q; i++) {
			int b = s.nextInt();
			ll.remove(b);
//			System.out.println(ll);
		}
		for(int i:ll){
			System.out.println(i +" ");
		}
	}
}