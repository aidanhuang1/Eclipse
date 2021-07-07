import java.util.*;
import java.io.*;
public class CCCBowlingforNumbers {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	//dp[i][j] = the max score you can get using i bowling balls and pins j

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int t = readInt(); //number of test cases
		
		for (int i=0; i<t; i++) {
			int n = readInt(), k = readInt(), w = readInt(); //n=number of bowling pins, k=number of bowling balls, w=width of the bowling balls
			int[][] dp = new int[k+1][n+1]; //first row are 0s, first column are 0s
			int[] pins = new int[n+1];
			for (int j=1; j<=n; j++) {
				pins[j] = readInt();
			}
			int[] sums = new int[n+1];
			sums[1] = pins[1];
			for (int j=2; j<=n; j++) {
				sums[j] = pins[j] + pins[j-1] + pins[j-2];
			}	
			System.out.println(Arrays.toString(sums));
			for (int row=1; row<=k; row++) { //find a way that incorporates multiple bowling balls
				for (int col=1; col<=n; col++) {
					dp[row][col] = Math.max(dp[row][col-1], sums[col]); 
				}
			}

			
			
			
			
			
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
