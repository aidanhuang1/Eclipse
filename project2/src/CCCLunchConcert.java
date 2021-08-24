import java.util.*;
import java.io.*;
public class CCCLunchConcert {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	
	static class friend {
		int pos;
		int walk;
		int hearing;
		public friend(int pos, int walk, int hearing) {
			this.pos = pos;
			this.walk = walk;
			this.hearing = hearing;
		}
	}
	
	static long movetime(int pos, friend[] friends) {
		long temp = 0;
		for (int i=0; i<friends.length; i++) {
			long tl = pos-friends[i].pos-friends[i].hearing;
			long tr = friends[i].pos-pos-friends[i].hearing;
			if (tl>0) {
				temp+=tl*friends[i].walk;
			} else if (tr>0) {
				temp+=tr*friends[i].walk;
			}
		}
		return temp;	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		friend[] friends = new friend[n];
		int left = Integer.MAX_VALUE, right = 0;
		for (int i=0; i<n; i++) {
			int position = readInt();
			left = Math.min(left, position);
			right = Math.max(right, position);
			friends[i] = new friend(position, readInt(), readInt());
		}

		int mid = 0;
		long score= 0;
		while (left <= right) {
			mid = left + (right - left) / 2; //b-search, mid = pos. of speaker
			score = movetime(mid, friends); 
			long leftscore = movetime(mid-1, friends);
			long rightscore = movetime(mid+1, friends); 
			if ((leftscore > score && rightscore > score) || (score==leftscore || score==rightscore)) {
				break;
			}
			else if (score < rightscore) {
				right = mid-1;
			} else if (score < leftscore) {
				left = mid+1;
			}	
		}
		System.out.println(score);
		
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
