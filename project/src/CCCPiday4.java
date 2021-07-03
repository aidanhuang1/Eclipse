import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCCPiday4 {
	//int is able to store 2^31 - 1.
	static int futureCounts[][][];
	static int findPath(int n, int k, int minPies) {
		if (n == k || k == 1 || minPies * k == n) {
			return 1;
		}
		
		if (futureCounts[n][k][minPies] == -1) { //if we have not visited yet
			int pathCount = 0;
			for (int i = minPies; i <= n / k; i++) { //start from the minimum, go up to the most allowed
				pathCount += findPath(n - i, k - 1, i); //MAYBE we do n-i because we are subtracting n pies by i pies, do k-1 to move to the next person, and iterating through i starting from minimum to maximum possible (minpies to n/k, which is maximum allowable)
				System.out.println(pathCount);
			}
			futureCounts[n][k][minPies] = pathCount;
		}
		return futureCounts[n][k][minPies];
	}
	
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(BR.readLine()), k = Integer.parseInt(BR.readLine());
		futureCounts = new int[n + 1][k + 1][n];
		for (int i = 0; i < futureCounts.length; i++)
		{
			for (int j = 0; j < futureCounts[0].length; j++)
			{
				Arrays.fill(futureCounts[i][j], -1);
			}
		}
		System.out.println(findPath(n, k, 1));
	}
}