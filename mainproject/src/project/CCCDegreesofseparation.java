package project;
import java.util.*;
import java.io.*;
public class CCCDegreesofseparation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<Integer>[] list; 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for (int i=0; i<list.length; i++) {
			list[i] = new ArrayList<Integer>();
		}
		list[1].add(6);
		list[2].add(6);
		list[3].add(4, 5, 6, 15);
		list[4].add();
		list[5].add();
		list[6].add();
		list[7].add();
		list[8].add();
		list[9].add();
		list[10].add();
		list[11].add();
		list[12].add();
		list[13].add();
		list[14].add();
		list[15].add();
		list[16].add();
		list[17].add();
		list[18].add();
		list[19].add();
		list[20].add();
		list[21].add();
		list[22].add();
		list[2].add();
		

		while (true) {
			char input = readCharacter();
			if (input=='i') {
				
			}
		}while t==true

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
