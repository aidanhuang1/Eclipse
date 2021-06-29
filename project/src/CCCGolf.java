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
		int[] hits = new int[distance+1]; //stores the number of strokes to get a distance of index
		Arrays.fill(hits, Integer.MAX_VALUE); //if at the end index value is max_value, we can't get there
		
		hits[0] = 0;
		for (int i=1; i<=distance; i++) {
			for (int j=0; j<clubs.length; j++) {
				if (i-clubs[j]>=0) {
					System.out.println(hits[i-clubs[j]]);
					hits[i] = Math.min(hits[i-clubs[j]]+1, hits[i]);
				}
			}	
		}
		System.out.println(Arrays.toString(hits));
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
