import java.util.*;
import java.io.*;
public class CCCLunchConcert2 {
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
		long temp = 0; //temp contains how long it would take for every friend to walk to within hearing range
		for (friend i: friends) {
			long walk = Math.abs(pos-i.pos)-i.hearing;
			if (walk>0) {
				temp += walk*i.walk;
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
		long s= 0;
		while (left <= right) {
			mid = left + (right - left) / 2; //bsearch, mid is the position of our speaker
			s = movetime(mid, friends); 
			long midleft = movetime(mid-1, friends); //midleft and midright are look at whether the left/right sides are greater or smaller,
			long midright = movetime(mid+1, friends); //move towards the smaller one, and if both are smaller than mid, we are at the lowest point
			if (midleft > s && midright > s) { //we are at the (absolute) minimum
				break;
			}
			if (s==midleft || s==midright) { //we are on a plateau
				break;
			}
			if (s < midright) { //to the right is larger, so we move left
				right = mid-1;
			} else if (s < midleft) { //to the left is larger, so we move right
				left = mid+1;
			}	
		}
		System.out.println(s);
		
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
