import java.util.*;
import java.io.*;
public class CCCGolf {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int distance = readInt(), n = readInt();
		int[] clubs = new int[n];
		for (int i=0; i<n; i++) {
			clubs[i] = readInt();
		}
		Arrays.sort(clubs);
		int[] hits = new int[distance+1];
		Arrays.fill(hits, Integer.MAX_VALUE/10);
		
		hits[0] = 0;
		for (int i=1; i<=distance; i++) {
			for (int j=0; j<clubs.length; j++) {
				if (i-clubs[j]>=0) {
					hits[i] = Math.min(hits[i-clubs[j]]+1, hits[i]);
				}
			}	
		}
		if (hits[distance]==Integer.MAX_VALUE/10) System.out.println("Roberta acknowledges defeat.");
		else System.out.printf("Roberta wins in %d strokes.", hits[distance]);
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
