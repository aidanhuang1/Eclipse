import java.util.*;
import java.io.*;
public class PriorityQueues {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(7); // [7]
		pq.add(2); // [7, 2]
		pq.add(1); // [7, 2, 1]
		pq.add(5); // [7, 5, 2, 1]
		System.out.println(pq.peek()); // 1
		pq.poll(); // [7, 5, 2]
		pq.poll(); // [7, 5]
		pq.add(6); // [7, 6, 5]

	}
}
