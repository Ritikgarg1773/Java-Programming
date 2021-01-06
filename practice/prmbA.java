import java.util.*;

class prmbA{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i =0;i<T;i++){
			int n = s.nextInt();
			int x = s.nextInt();
			int[] array = new int[n];
			for(int j= 0;j<n;j++){
				array[j] = s.nextInt();
			}
			int flag =0; // check if there is atleast 1 odd number
			int count = 0; // get the number of even elements
			for(int j =0;j<n;j++){
				if(array[j]%2==1)flag++;
				else count++;
			}
			if(count >= x-flag)System.out.println("Yes");
			else System.out.println("No");
		}
	}
}