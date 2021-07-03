import java.io.*;
import java.util.*;

/*
 * This is code 
 * taken from another user (appleater), review and learn
 */

public class CCCPiday2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	//have a dp[n][k]
	//n is # of pieces of pie
	//k is # of people
	//give 1 pie to everyone to start off
	/*
	 * Go down recursively
	 * Start  y having the dp[4][4] (un example case
	 * go all the way down
	 * that means 4 to last person
	 * after that, return 1 where you have 1 sol'n
	 * after that , go up 1, and give 1 pie to second last person
	 * that gives 3 to the last
	 * we can do that again
	 * therefore, we can get to 1, 1, 3, 3,
	 * after that, we have to go up again
	 * give 1 pie to 2nd person
	 * therefore, we have 1, 2, 2, 3
	 * we can't do anything further, so we just go up one more time, give one more to first person
	 * we have 2, 2, 2, 2
	 * kinda like a depth first search???
	 * 
	 * 
	 * dp will have two choices
	 * dp[n][k - 1] (move down to the next person
	 * dp[n-k][k] give a pie to everyone from n to the end (hence subtracting k n)
	 * base case: fun(pie, k) (fun is function)
	 * if pie = 0 || k == 1
	 * just one possible way
	 * pie == 0 > noone gets pie
	 * k == 1? -> plast person gets all n
	 * dp[pie][k] = fun(pie, k - 1) + fun(pie-k, k)
	 * call the function like this: fun(n - k, k) (where we give 1 pie to everyone to start it off
	 * 
	 */
	
	//ccc2015 j5
	
	public static int[][] dp;//maximum limit for this ccc
	//dp is here to PREVENT DUPLICATE WORK
	public static int pie (int n, int k) {
		if (n < k) {
			return 0;
		}
		if (n == 0 || k == 1) {
			return 1;
		}	
		if (dp[n][k] > 0) {
			return dp[n][k];
		}
		
		dp[n][k] = pie(n-1, k - 1) + pie(n - k, k);
		
		return dp[n][k];
	}
	
		
	//here with pie(n, k - 1), this accounts for moving down the chain (adding another person)
	//the pie(n - k) accounts for adding a pie to this person, which causes a pie to be added to EVERYONE
	//we don't record how many n a person may get, we just care about the state of # of k and # of n
	//eventually, this finishes everything off
	
	public static void main(String[] args) throws IOException{
		int n = readInt();
		int k = readInt();
		dp = new int[n+1][n+1];
		if (n == k) {
			System.out.println(1);
			return;
		}
		
		System.out.println(pie(n, k));
		
		
		
		for (int[] i: dp) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();	
	}
	
	
	
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}