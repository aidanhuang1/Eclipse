import java.util.*;
import java.io.*;
public class CCOGeesevsHawks2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		char[] result1 = new char[n+1], result2 = new char[n+1];
		int[] goals1 = new int[n+1], goals2 = new int[n+1];
		String[] first1 = readLine().split("");
		for (int i=1; i<=n; i++) {
			result1[i] = first1[i-1].charAt(0);
			goals1[i] = readInt();
		}
		String[] first2 = readLine().split("");
		for (int i=1; i<=n; i++) {
			result2[i] = first2[i-1].charAt(0);
			goals2[i] = readInt();
		}
		int first = 0, second=0, third=0,fourth=0;
		/*first = option 1, second = option 2, third...., fourth... etc.
		 */

		int[][] dp = new int[n+1][n+1];
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				
				//In these if statements, we are finding a value for the variable first
				//This option is if the nth game played by the geese and the nth game played by the hawks is stripped out (disregarded temporarily)
				//and we look back at the n-1 game played by the geese and hawks (dp[i-1][j-1]) and add the goals for geese and hawks
				
				//the || is because either the geese could be the winners or the hawks could be the winners for that game
				if ((result1[i]=='W' && result2[j]=='L' && goals1[i]>goals2[j]) || (result1[i]=='L' && result2[j]=='W' && goals1[i]<goals2[j])) {
					first = dp[i-1][j-1] + goals1[i] + goals2[j]; 
				} else { 
					first = 0; //this is if game i and game j are not rivalry games between the geese and hawks (or do not satisfy the conditions), and so option 1 is not possible
					//and we can set first to 0 because option 2 already covers dp[i-1][j-1], option 1 only includes the goals from each team but we should not include them if the if statement is false
				}
				
				second = dp[i-1][j-1]; //option 2 where if the optimal solution may not be related to the final game (you could actually not include this and the code will still pass)
				third = dp[i-1][j]; //option 3 where the optimal solution has nothing to do with the geese game
				fourth = dp[i][j-1]; //option 4 where the optimal solution has nothing to do with the hawk game
				dp[i][j] = Math.max(first, Math.max(second, Math.max(third, fourth))); //we take the maximum of all of these
			}
		}
		System.out.println(dp[n][n]);
		for (int i[]: dp) {
			System.out.println(Arrays.toString(i));	
		}

	}

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
