import java.util.*;
import java.io.*;
public class Test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt();
		ArrayList<Integer>[] slides = new ArrayList[N];
		int[] paths = new int[N];
		paths[0] = 1;
		for (int i=0; i<slides.length; i++) {
			slides[i] = new ArrayList<Integer>();
 		}
		
		while (true) {
			int x = readInt()-1, y = readInt()-1;
			if (x==-1 && y==-1) {
				break;
			}
			slides[x].add(y);
		}
		
		for (int i=0; i<N; i++) {
			for (int j: slides[i]) {
				paths[j] = paths[j]+paths[i];
			}
		}
		System.out.println(paths[N-1]);
		
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
