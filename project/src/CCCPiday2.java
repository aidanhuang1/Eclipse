import java.io.*;
import java.util.*;

/*
 * This is code 
 * taken from another user (appleater), review and learn
 */

public class CCCPiday2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	//have a dp[i][j]
	//i is # of pies
	//j is # of people
	//give 1 pie to everyone to start off
	/*
	 * Go down recursively
	 * Start  y having the dp[4][4] (un example case
	 * go all the way down
	 * that means 4 to last person
	 * after that, return 1 where you have 1 sol'n
	 * after that , go up 1, and give 1 pie to second last person
	 * that gives 3 to the last
	 * we can do that again
	 * therefore, we can get to 1, 1, 3, 3,
	 * after that, we have to go up again
	 * give 1 pie to 2nd person
	 * therefore, we have 1, 2, 2, 3
	 * we can't do anything further, so we just go up one more time, give one more to first person
	 * we have 2, 2, 2, 2
	 * kinda like a depth first search???
	 * dp will have two choices
	 * dp[i][j - 1] (move down to the next person
	 * dp[i-j][j] give a pie to everyone from i to the end (hence subtracting j pies)
	 * base case: fun(pie, people) (fun is function)
	 * if pie = 0 || people == 1
	 * just one possible way
	 * pie == 0 > noone gets pie
	 * people == 1? -> plast person gets all pies
	 * dp[pie][people] = fun(pie, people - 1) + fun(pie-people, people)
	 * call the function like this: fun(n - k, k) (where we give 1 pie to everyone to start it off
	 * 
	 */
	
	//ccc2015 j5
	
	public static int[][] dp = new int[251][251];//maximum limit for this ccc
	//dp is here to PREVENT DUPLICATE WORK
	public static int pie (int curPies, int curPeople) {
		if (curPies < 0) {
			return 0;
		}
		if (curPies == 0 || curPeople == 1) {
			return 1;
		}
		if (dp[curPies][curPeople] > 0) {
			return dp[curPies][curPeople];
		}

		return dp[curPies][curPeople] = pie(curPies, curPeople - 1) + pie(curPies - curPeople, curPeople);
	}
	//here with pie(curPies, curPeople - 1), this accounts for moving down the chain (adding another person)
	//the pie(curPies - curPeople) accounts for adding a pie to this person, which causes a pie to be added to EVERYONE
	//we don't record how many pies a person may get, we just care about the state of # of people and # of pies
	//eventually, this finishes everything off
	
	public static void main(String[] args) throws IOException{
		int pies = readInt();
		int people = readInt();
		if (pies == people) {
			System.out.println(1);
			return;
		}
		System.out.println(pie(pies - people, people));
		
	}
	
	
	
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}