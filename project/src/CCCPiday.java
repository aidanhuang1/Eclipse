import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCCPiday {
	
	/*
	 * We are creating a 3d array, 
	 * dp[n][k][min], where n is the number of pies, k is the number of people, and min is the minimum possible pies currently
	 * n/k represents the maximum possible pies for the first person to take, because the following people need to have the same number of pies or greater
	 * n/k = 9/4 would give us 2, and 2 being the maximum possible pies that the first person can have. 
	 * This would look like 2, 2, 2, 3 which is the maximum possible with 9 pies and 4 people
	 * 
	 * in the method, we call dp[n][k][1] in the beginning and return dp[n][k][min] when we are done
	 * shown by the for loop, we start with the minimum and end at n/k, the maximum
	 * pathCount contains the total number of ways that pies can be given out, and dp[n][k][min] will contain the final answer
	 * At the end, min will be at n/k and it will return dp[n][k][min], the total number of ways.
	 * 
	 * in the findPath recursive call, n-i means subtracting the pies remaining to be given out by the pies that can be taken out
	 * k-1 means moving to the next person when we are done
	 * i is simply the minimum pies
	 * 
	 * At the beginning of the findPath method, n==k is if the number of pies = the number of people, so everyone gets a pie
	 * k==1 is if there is only one person, so that one person gets all the pies
	 * and min*k == n is if the minimum pies times the number of people is the number of pies we can give out
	 * like if min = 2 and k = 4 and n = 8,
	 * 2 * 4 = 8, and it would look like 2, 2, 2, 2
	 */
	static int dp[][][];
	static int findPath(int n, int k, int min) {
		if (n == k || k == 1 || min * k == n) {
			return 1;
		}

		if (dp[n][k][min] == -1) { //if we have not visited yet
			int pathCount = 0;
			for (int i = min; i <= n / k; i++) { //start from the minimum, go up to the most allowed
				pathCount += findPath(n - i, k - 1, i); //MAYBE we do n-i because we are subtracting n pies by i pies, do k-1 to move to the next person, and iterating through i starting from minimum to maximum possible (min to n/k, which is maximum allowable)
			}
			dp[n][k][min] = pathCount;
		}
		return dp[n][k][min];
	}

	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(BR.readLine()), k = Integer.parseInt(BR.readLine());
		dp = new int[n + 1][k + 1][n];
		for (int i = 0; i < dp.length; i++)
		{
			for (int j = 0; j < dp[0].length; j++)	
			{
				Arrays.fill(dp[i][j], -1);
			}
		}
		System.out.println(findPath(n, k, 1));
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=k; j++) {
				for (int p=0; p<n; p++) {
					System.out.print(dp[i][j][p]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}