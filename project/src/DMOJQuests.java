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
	 * 
	 *  3 6
		6 1 3 1
		7 1 1 1
		3 1 9 2
		dp[][] is the maximum number of gold obtained


		if dp[K][0] is not going to the NPC and dp[K][1] is going to the NPC, where K is the number of hours elapsed
		Then going to the NPC for dp[K][1] will be the Math.max (dp[K-h][0] + g, dp[K-t][1] + q)	
		This math comparison works because the first part takes the goal from your previous position and adds it by gold gained along the way
		The second part is for completing the quest at the NPC we are at now

		NOTE THAT G AND H ARE IN THEIR OWN GROUP, AND T AND Q ARE IN THEIR OWN GROUP
		THIS MEANS THAT WE ARE LOOKING AT TWO DIFFERENT CASES:

		(1) ONE WHERE (G AND H) THE PLAYER TRAVELS BUT DOES NOT GO TO THE NPC
		(2) AND THE OTHER (T AND Q) WHERE THE PLAYER GOES TO THE NPC AT THEIR CURRENT POSITION
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int NPCs = readInt(), hours = readInt(); //NPCs = number of NPCs, hours = max number of hours
		long[][] dp = new long[hours+1][2];
		for (int i=1; i<=NPCs; i++) {
			int g = readInt(), h = readInt(), q = readInt(), t = readInt();
			//			int temp = i%2;
			for (int j=0; j<=hours; j++) {
				//				dp[i][temp] = Math.max(dp[i-h][0]+g, dp[i-t][1]+q);
				if (j-h>=0) {
					dp[j][0] = Math.max(dp[j][0], dp[j-h][1]+g);
				}
				if (j-t>=0) {
					dp[j][1] = Math.max(dp[i-h][0]+g, dp[i-t][1]+q);
				}
			}	
		}
		for (long[] i: dp) {
			System.out.println(Arrays.toString(i));
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
