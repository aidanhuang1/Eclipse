package project;
import java.util.*;
import java.io.*;
public class CCCItstoughbeingateen6 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		boolean[][] list = new boolean[8][8];
		list[1][7] = true;
		list[1][4] = true;
		list[2][1] = true;
		list[3][4] = true;
		list[3][5] = true;
		int[] ind = {0, 1, 0, 0, 2, 1, 0, 1};
		while(true) {
			int a = readInt(), b = readInt();
			if (a==0 && b==0) break;
			list[a][b] = true;
			ind[b]++;
		}
		ArrayList<Integer> order = new ArrayList<>();
		for (int l=0; l<7; l++) {
			for (int i=1; i<=7; i++) {
				if (ind[i]==0) {
					for (int j=1; j<=7; j++) {
						if (list[i][j]) {
							ind[j]--;
						}
					}
					ind[i] = -1;
					order.add(i);
					break;
				}
			}
		}
		System.out.println(order.size());
		if (order.size()==7) {
			for (int i: order) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("Cannot complete these tasks. Going to bed.");
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
