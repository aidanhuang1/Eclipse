import java.util.*;
import java.io.*;
public class CCCBananas {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static boolean check(String word) {
		if (word.length()==1 && word.equals("A")) { 
			return true;
		}
		if (word.startsWith("A") && word.charAt(1)=='N') {
			return check(word.substring(2, word.length()));
			
		} 	
		if (word.startsWith("B")) {	
			for (int i=1; i<word.length(); i++) {
				if (word.charAt(i)=='S' && (word.charAt(i-1)=='S' || word.charAt(i-1)=='A')) {
					word = word.replaceFirst("S", "");
					return check(word.substring(1, word.length()));
				}
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		while (true) {
			String input = br.readLine();
			if (input.equals("X") && input.length()==1) {
				break;
			}
			if (check(input)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
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