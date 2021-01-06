import java.util.*;

class FIBONACCI{
	public static int Fibo_recurssion(int n){
		if (n <=1 ) {
			return n;
		}
		return Fibo_recurssion(n-1) + Fibo_recurssion(n-2);
	}

	public static void Fibo_topdown(int n){
		int[] array = new int[n+1];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2;i<=n ; i++ ) {
			array[i] = array[i-1] + array[i-2];
		}
	}

	public static int Fibo_memoized(int[] array, int n){
		if (n <=1 ) {
			return n;
		}
		if(array[n] != -1) {
			return array[n];
		}
		array[n] = Fibo_memoized(array,n-1) + Fibo_memoized(array,n-2);
		return array[n];
	}
	
}