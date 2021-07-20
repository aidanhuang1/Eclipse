import java.util.*;
import java.io.*;
public class CCCBridgeCrossing {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	Let dp[i] be the earliest possible time when person i is about to cross

	essentially all the various combinations are tested in the following
	order (assuming m = 3 for example)
	a
	ab
	abc

	a b
	a bc
	a bcd

	ab c
	ab cd
	ab cde
	...
	 */




	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int m = readInt(), q = readInt(); 
		String[] person = new String[101];
		int[] time = new int[101], dp = new int[101], group = new int[101];
		for (int i=0; i<q; i++) {
			person[i] = readLine();
			time[i] = readInt();
		}
		Arrays.fill(dp, Integer.MAX_VALUE/10);
		dp[0] = 0;
		for (int i = 0; i < q; i++) { 
			int s = 0;
			for (int j = 0; j < m; j++) { 
				if (i + j <= q) {
					s = Math.max(s, time[i + j]);
					if (dp[i] + s < dp[i + j + 1]) {
						dp[i + j + 1] = dp[i] + s;
						group[i + j + 1] = i;
					}
				}
			}
		}
		
		ArrayList<Integer> order = new ArrayList<>();
		int cur = q;
		while (true) {
			order.add(cur);
			if (cur == 0) break;
			cur = group[cur];
		}
		Collections.reverse(order);
		
		System.out.println("Total Time: "+ dp[q]);
		for (int i = 0; i < order.size() - 1; i++){
			for (int j = order.get(i); j < order.get(i+1); j++){
				System.out.print(person[j]+" ");
			}
			System.out.println();
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
