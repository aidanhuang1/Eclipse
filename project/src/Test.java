import java.io.*;
import java.util.Arrays;

/**
 * Solution to CCC 2015 Junior Problem 5 - Pi Day
 * Written by Jonathan Uy on March 11 2020
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        /*
         * We will now conduct dynamic programming.
         * Let dp[i][j] represent the number of ways to give
         * i pies to j people following the description in the problem.
         * Thus the answer will be stored in dp[N][K].
         * There is only one way to give one person a pie.
         */
        int[][] dp = new int[N+1][N+1];
        dp[1][1] = 1;

        /*
         * State transition:
         *  - You could give everyone else one less pie (+dp[i-j][j])
         *  - You could add one more person to the end and give him one pie (+dp[i-1][j-1])
         */
        for(int i = 2; i <= N; i++)
            for(int j = 1; j <= i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-j][j];
        		for (int k[]: dp) {
        			System.out.println(Arrays.toString(k));
        		}
        		System.out.println();
            }
        /*
         * As said before, the answer is stored in dp[N][K].
         */
        System.out.println(dp[N][K]);
    }
}