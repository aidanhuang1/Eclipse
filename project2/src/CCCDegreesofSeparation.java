import java.util.*;
import java.io.*;
public class CCCDegreesofSeparation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;
	static ArrayList<Integer>[] adj;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		adj = new ArrayList[51];
		for (int i=1; i<=50; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		adj[1].add(6); adj[6].add(1); adj[2].add(6); adj[6].add(2);
		adj[3].add(6); adj[6].add(3); adj[7].add(6); adj[6].add(7);
		adj[4].add(6); adj[6].add(4); adj[5].add(6); adj[6].add(5);
		adj[4].add(3); adj[3].add(4); adj[5].add(4); adj[4].add(5);
		adj[5].add(3); adj[3].add(5); adj[3].add(15); adj[15].add(3);
		adj[7].add(8); adj[8].add(7); adj[8].add(9); adj[9].add(8);
		adj[10].add(9); adj[9].add(10); adj[10].add(11); adj[11].add(10);
		adj[11].add(12); adj[12].add(11); adj[13].add(12); adj[12].add(13);
		adj[13].add(15); adj[15].add(13); adj[13].add(14); adj[14].add(13);
		adj[16].add(17); adj[17].add(16); adj[17].add(18); adj[18].add(17);
		adj[16].add(18); adj[18].add(16); adj[12].add(9); adj[9].add(12);

		while(true) {
			char command = readCharacter();
			if (command=='q') break;
			else if (command=='i') { //befriend
				int a = readInt(), b = readInt();
				if (!adj[a].contains(b)) {
					adj[a].add(b);
					adj[b].add(a);
				}
			}
			else if (command=='d') {
				int a = readInt(), b = readInt();
				for (int i = 0; i < adj[a].size(); i++) {
                    if (adj[a].get(i) == b) {
                        adj[a].remove(i);
                        break;
                    }
                }
                for (int i = 0; i < adj[b].size(); i++) {
                    if (adj[b].get(i) == a) {
                        adj[b].remove(i);
                        break;
                    }
                }
			}
			else if (command=='n') {
				int count = 0;
				for (int e: adj[readInt()]) {
					count++;
				}
				System.out.println(count);
			}
			else if (command=='f') {
				int a = readInt(), count = 0;
				boolean[] visited = new boolean[51];
				Queue<Integer> queue = new LinkedList<>();
				visited[a] = true;
				for (int e: adj[a]) {
					visited[e] = true;
					queue.add(e);
				}
				while(!queue.isEmpty()) {
					for (int r: adj[queue.poll()]) {
						if (!visited[r]) {
							visited[r] = true;
							count++;
						}
					}
				}
				System.out.println(count);
			}
			else if (command=='s') {
				int a = readInt(), b = readInt();
				boolean[] visited = new boolean[51];
				int[] dist = new int[51];
				Arrays.fill(dist, Integer.MAX_VALUE);
				dist[a] = 0;
				Queue<Integer> q = new LinkedList<>();
				q.add(a);
				while (!q.isEmpty()) {
					int temp = q.poll();
					visited[temp] = true;
					for (int i: adj[temp]) {
						if (!visited[i]) {
							q.add(i);
							visited[i] = true;
							dist[i] = dist[temp] + 1;
						}
					}
				}
				if (!visited[b]) {
					System.out.println("Not connected");
				} else 
				System.out.println(dist[b]);
			}
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
