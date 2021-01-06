package practice;
import java.util.*;
public class Recurrsion {
	public static boolean isSorted(int[] array, int n){
		if (n== array.length-1) {
			return true;
		}
		System.out.println(array[n] +" " + array[n+1]);
		if (array[n]>array[n+1]) {
			return false;
		}
		return isSorted(array, n+1);
	}
	 public static int[] findAllIndex(int[] nums, int index, int target, int count){
        if (index == nums.length){
        	// if the element is not, the value of count is 0, so it will return an empty array;
            return new int[count]; 
        }

        if (nums[index] == target){

            int[] result = findAllIndex(nums, index + 1, target, count+1);
            result[count] = index;

            return result;
        }

        return findAllIndex(nums, index + 1, target, count);
    }
    public static void triangleDown(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            System.out.println();
            triangleDown(row - 1, 0);
            return;
        }

        System.out.print("*");
        triangleDown(row, col + 1);
    }
    public static boolean isBinary(String str)
	{
	  //Your code here
	  //StringBuilder s = new StringBuilder(str);
	  for(int i =0;i<str.length();i++){
	  	  // System.out.print(str.charAt(i) +" ");
	      if(str.charAt(i)!='0' && str.charAt(i)!='1'){
	          return false;
	      }
	  }
	  return true;
	}
	public static void print(int n){
		if(n == 0) return;
		if (n%2 == 1) System.out.println(n);
		print(n-1);
		if (n%2 == 0) System.out.println(n);
	}
	public static void pascaltriangle(int n){
		// if (row == -1) {                                          |
		// 	return 1;                                                |
		// }                                                         |
		// if (row+1 == col) {                                       |
		// 	int val = pascaltriangle(row-1,0);                       |
		// 	System.out.println();                                    |
		// 	return 1;                                                |
		// }                                                         |
		// int val = pascaltriangle(row, col+1);                     |
		// System.out.print(val +" ");                               |
		// return val * (col)/(row - col +1);                        |
		// --------------------- iterative code ---------------------|
		for(int line = 1; line <= n; line++) 
    	{ 
          
    		int C=1;// used to represent C(line, i) 
    		for(int i = 1; i <= line; i++) 
    			{  
			        // The first value in a line is always 1 
			        System.out.print(C+" "); 
			        C = C * (line - i) / i;  
			    } 
			System.out.println(); 
		} 
	}
	public static void rightTriangle(int row, int col){
		if (row ==-1 ) {
			return;
		}
		if (row == col) {
			System.out.println();
			rightTriangle(row-1, 0);
			return;
		}
		System.out.print("*");
		rightTriangle(row, col+1);
		return;
	}
	public static int firstIndex(int[] array, int n, int M){
		if (n == array.length) {
			return -1;
		}
		if (array[n] == M) {
			return n;
		}
		return firstIndex(array,n+1,M);
	}
	public static int lastIndex(int[] array, int n, int M){
		if (n ==0) {
			return -1;
		}
		if (array[n] == M) {
			return n;
		}
		return lastIndex(array,n-1,M);
	}
	 public static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
           String first = processed.substring(0, i);
           String last = processed.substring(i);

           permutation(first + ch + last, unprocessed);
        }
    }
 static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
    public static void permuteBuilder(StringBuilder processed, StringBuilder unprocessed){
        if (unprocessed.length() == 0){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed.deleteCharAt(0);

        for (int i = 0; i <= processed.length() ; i++) {
            processed.insert(i, ch);
            permuteBuilder(processed, unprocessed);
            processed.deleteCharAt(i);
        }

        unprocessed.insert(0, ch);
    }
	public static void main(String args[]){
		//int[] array = {1,2,5,6};
		// System.out.println(Arrays.toString(findAllIndex(array,0,0,0)));
		//triangleDown(4,4);
		// Scanner s = new Scanner(System.in);
		// int t = s.nextInt();
		// s.nextLine();
		// for (int i =0;i<t ;i++ ) {
		// 	String a = s.nextLine();
		// 	System.out.println(isBinary(a));
		// }
		// print(6);
		// rightTriangle(5,5);
		// pascaltriangle(5);
		// int[] array = {1,2,5,3,5,4,5,6,5,7};
		// int t = firstIndex(array,0,5);
		// int t1 = lastIndex(array,9,5);
		// System.out.println(t +" " + t1);
		// permutation("","abb");
		// printPermutn("abb","");
		permuteBuilder(new StringBuilder("abc"),new StringBuilder());
	}
}
