import java.util.*;
import java.io.*;
public class DMOJQuests {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	/*
	 * N H
	 * g h q t
	 * g = gold gained along the way, h = hours to travel to npc, q = gold rewarded, t = time needed for completing quest
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), h = readInt();
		

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
