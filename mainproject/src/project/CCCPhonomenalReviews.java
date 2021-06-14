package project;
import java.util.*;
import java.io.*;
public class CCCPhonomenalReviews {
	

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static boolean ispho[]; //novisit we dont go to that node
	static int N, M, farnode, maxdistance;
	static ArrayList<Integer>[] allrestaurants;
	static ArrayList<Integer> leafnodes = new ArrayList<>();
	static ArrayList<Integer> novisit = new ArrayList<>();
 	/*
	 * At the beginning, we iterate through the nodes. If we are at a non-pho resturant node and we are
	 * pointing (have a neighbour to) a non-pho restaurant node then 
	 * 
	 * We could start from node 0 till node N-1, looking to find the shortest distance
	 * We would need to keep track of a totalmin (smallest distance across all starting nodes)
	 * We would need a local visited boolean array (clears when the iteration is over)
	 * We need a local distance array, find out the distance it took to get there
	 * and whenever we go to a new node, we update its distance (no matter if it is greater, smaller, or equal)
	 * at the end when we have visited all nodes, we iterate through dist array
	 * adding up values that have pho restaurants, comparing with totalmin
	 */
	
	
	
	/*
	 * Editorial
	 * 
	 * To find leaf nodes, when we are done inputting values into the adjacency list,
	 * we look to see if there are nodes which only have one outdegree
	 * if no, make the boolean true, else, leave the boolean as it is
	 * 
	 * At the beginning, we start from the leaves of the tree and going up to the root.
	 * If we find a non-pho node, we remove that node
	 * If we find a pho node, we break the search
	 */
	
	public static void DFS(int leaf) {
		while (!ispho[leaf] && !novisit.contains(leaf)) {
			novisit.add(leaf);
			for (int i: allrestaurants[leaf]) {	
				if (!ispho[i] && !novisit.contains(i) && allrestaurants[i].size()<=1) {
					allrestaurants[i].remove(0);
					DFS(i);
				} else {
					farnode = i;
				}
			}
		}
	}
	
	public static void diameter(int prev, int current, int distance) {
		for (int i: allrestaurants[current]) {
			if (!novisit.contains(i) && i!=prev) {
				diameter(current, i, distance+1);
			}
		}
		if (distance > maxdistance) {
			maxdistance = distance;
		}
	}
	public static int count() {
		int totaldistance = 0;
		for (ArrayList<Integer> i: allrestaurants) {
			for (int j=0; j<i.size(); j++) {
				if (!novisit.contains(i.get(j))) {
					totaldistance++;
				}
			}
		}
		totaldistance -= maxdistance;
		return totaldistance;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		N = readInt();
		M = readInt();
		ispho = new boolean[N];
		allrestaurants = new ArrayList[N];
		for (int i=0; i<allrestaurants.length; i++) {
			allrestaurants[i] = new ArrayList<Integer>();
		}
		for (int i=0; i<M; i++) {
			ispho[readInt()] = true;
			
		}
		for (int i=0; i<N-1; i++) {
			int current = readInt();
			int to = readInt();
			allrestaurants[current].add(to);
			allrestaurants[to].add(current);
		}
		for (int i=0; i<allrestaurants.length; i++) {
			if (allrestaurants[i].size()==1) {
				leafnodes.add(i);
			}
		} //we have found all the leaf nodes
		//prune
		
		while(!leafnodes.isEmpty()) {
			DFS(leafnodes.remove(0));
		}
		
		for (int i=0; i<N; i++) {
			if (!novisit.contains(i))
			for (int j=0; j<allrestaurants[i].size(); j++) {
				if (!novisit.contains(allrestaurants[i].get(j))) {
					System.out.print(allrestaurants[i].get(j)+" ");
				}
			}
			System.out.println();
		}
		
		diameter(-1, farnode, 0);
		System.out.println();
		System.out.println(count());
		
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
