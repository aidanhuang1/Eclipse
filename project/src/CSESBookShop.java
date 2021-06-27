
import java.util.*;
import java.io.*;
public class CSESBookShop {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	//This is an 0/1 knapsack problem

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), max = readInt();
		long[] dp = new long[max+1];
		int[] prices = new int[n];
		int[] pages = new int[n];
		//We store input because prices and pages input are on different lines
		for (int i=0; i<n; i++) {
			prices[i] = readInt();
		}
		for (int i=0; i<n; i++) {
			pages[i] = readInt();
		}
		
		
		//This is simply 0/1 knapsack, good idea to draw out the implement/arrays on paper first to visualize
		for (int i=0; i<n; i++) {
			int price = prices[i];
			int page = pages[i];
			for (int j=max; j>=price; j--) {
				dp[j] = Math.max(dp[j], dp[j-price]+page);
			}
		}
		System.out.println(dp[max]);
		

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
