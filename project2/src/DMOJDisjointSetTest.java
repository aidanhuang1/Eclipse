import java.util.*;
import java.io.*;
public class DMOJDisjointSetTest {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	public static int[] ds;
	
	static int Find(int x) {
        if(x != ds[x]) {
        	ds[x] = Find(ds[x]);
        }
        return ds[x];
    }

    static void Union(int u, int v) {
        ds[u] = v;
    }
	
	public static void main(String[] args) throws IOException {
		int n = readInt(), m = readInt(), count = 0;
		ArrayList<Integer> E = new ArrayList<>();

		ds = new int[n+1];
		for(int i = 1; i <= n; i++) {
			ds[i] = i;
		}

		for(int i = 1; i <= m; i++) {
			int a1 = Find(readInt()), b1 = Find(readInt());
			if(a1 != b1) {
				Union(a1, b1);
				count++;
				E.add(i);
			}
			if(count == n - 1) {
				break;
			}
		}
		
		
		if(count == n-1) {
			for(int u: E) {
				System.out.println(u);
			}
		} else {
			System.out.println("Disconnected Graph");
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
