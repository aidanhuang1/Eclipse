import java.util.*;
import java.io.*;
public class CCCPiday3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static int[][][] visited;

	public static int pi(int n, int k, int min) {
		if (visited [n][k][min] == 0) { 
			if (n == k){
				visited[n][k][min] = 1;
			}
			else if (k == 1){
				visited[n][k][min] = 1;
			}
			else {
				int t = 0;
				for (int i=min; i<(n/k)+1; i++) {
					t = t + pi(n-i, k-1, i);
				}
				visited[n][k][min] = t;
			}
		}
		return visited[n][k][min];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
