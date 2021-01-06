import java.io.*;
import java.util.*;

class helper{
	int num=0;
	int time=0;
	int score=0;
	public helper(int time, int score,int num) {
		this.time=time;
		this.score=score;
		this.num=num;
	}
}

public class test {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		HashSet<Integer> set=new HashSet<>();
		HashMap<Integer,helper> mp=new HashMap<>();

		int n =Reader.nextInt();
		int m=Reader.nextInt();
		mp.put(1,new helper(0,0,1));
		while(m-->0) {
			int team=Reader.nextInt();
			int ttime=Reader.nextInt();
			if(mp.containsKey(team)) {
				helper obj=mp.get(team);
				obj.score+=1;
				obj.time+=ttime;
				mp.put(team, obj);
			}
			else {
				helper obj=new helper(ttime,1,team);
				mp.put(team, obj);
			}
			helper maut=mp.get(1);
			if(team==1) {
				Iterator<Integer> it=set.iterator();
				while(it.hasNext()) {
					int i=it.next();
					helper obj=mp.get(i);
					if(obj.score<maut.score || (obj.score<=maut.score && obj.time>=maut.time))
						it.remove();
				}
			}
			else {
				helper obj=mp.get(team);
				if(obj.score>maut.score || (obj.score>=maut.score && obj.time<maut.time))
					set.add(obj.num);
			}
			System.out.println(set.size()+1);


		}




	}
}





class Reader {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	/** call this method to initialize reader for InputStream */
	static void init(InputStream input) {
		reader = new BufferedReader(
				new InputStreamReader(input) );
		tokenizer = new StringTokenizer("");
	}

	/** get next word */
	static String next() throws IOException {
		while ( ! tokenizer.hasMoreTokens() ) {
			//TODO add check for eof if necessary
			tokenizer = new StringTokenizer(
					reader.readLine() );
		}
		return tokenizer.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
}