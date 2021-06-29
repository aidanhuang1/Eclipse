import java.util.*;
import java.io.*;
public class DMOJRestaurants {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), T = readInt(), K = readInt(), V = readInt();
		//N = length of road, T = segment length, K = number of desired restaurants in each segment, V = existing restaurants
		boolean[] road = new boolean[N+1];
		for (int i=0; i<V; i++) {
			road[readInt()] = true;
		}	
		int fullarrays = N/T;
		int shift = N%T;
		if (shift!=0) { //if we do not have a full size T on the last subset
			fullarrays+=1;
		}
		
		int[][] dp = new int[fullarrays][T];
		System.out.println(Arrays.deepToString(dp));
		for (int i=0; i<fullarrays; i++) {
			for (int j=(i+1)*T; j)
		}
		
// 		for (int i=1; i<=N; i++) {
//			for (int j=1; j<=j+T; j++) {
//				
//			}
//		}
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
