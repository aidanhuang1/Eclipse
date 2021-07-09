import java.util.*;
import java.io.*;
public class DMOJTestScores {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	public static class test implements Comparable<test>{
		int currentscore;
		int studyhours;
		public test(int currentscore, int studyhours) {
			this.currentscore = currentscore;
			this.studyhours = studyhours;
		}
		@Override
		public int compareTo(DMOJTestScores.test o) {
			// TODO Auto-generated method stub
			return studyhours-o.studyhours;
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt(), m = readInt(), k = readInt(); //n = #of tests, m = #max marks per test, k = minimum mark on rc
		long minimum = n*k;
		long score = 0, hours = 0;
		PriorityQueue<test> pq = new PriorityQueue<>();
		for (int i=0; i<n; i++) {
			int x = readInt(), y = readInt();
			score+=x;
			pq.add(new test(x, y));
		}
		
		while(minimum>score && !pq.isEmpty()) {
			test temp = pq.poll();
			for (int i=temp.currentscore; i<m; i++) {
				if (minimum<=score) break;
				hours+=temp.studyhours;
				score++;
			}
		}
		System.out.println(hours);
		
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
