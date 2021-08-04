import java.util.*;
import java.io.*;
public class CCOComputerPurchaseReturn {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	public static class Pairs {
		int cost;
		int value;
		public Pairs(int cost, int value) {
			this.cost = cost;
			this.value = value;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int T = readInt(), N = readInt();
		ArrayList[] type = new ArrayList[T+1];
		for (int i=0; i<type.length; i++) {
			type[i] = new ArrayList<Pairs>();
		}	
		for (int i=0; i<N; i++) {
			int cost = readInt(), value = readInt(), t = readInt();
			type[t].add(new Pairs(cost, value)); 
		}

		int budget = readInt();
		int[][] dp = new int[T+1][budget+1];
		for (int[] i: dp) {
			Arrays.fill(i, -1); //because we are looking for the maximum and sometimes, a component cannot be purchased at a given time
		}
		for (int i=0; i<=budget; i++) {
			dp[0][i] = 0; //because to get 0 components, we dont need any costs, and the total value will just be 0
		}
		
		for (int i=1; i<=T; i++) {
			for (int j=0; j<type[i].size(); j++) { //this for loop is because you are looking through groups of components, and there must be only one component from each group
				Pairs cur = (CCOComputerPurchaseReturn.Pairs) type[i].get(j);
				for (int k=0; k<=budget; k++) {
					if (k>=cur.cost && dp[i-1][k-cur.cost] != -1) { //if it is -1, we do not have enough to buy that components, and if dp[i-1][k-cur.cost]=-1, we couldn't buy that last component at the current time 
						dp[i][k] = Math.max(Math.max(dp[i][k], dp[i][k-1]), cur.value + dp[i-1][k-cur.cost]);
					}
				}
			}
		}
		System.out.println(dp[T][budget]);
		for (int [] i: dp) {
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
