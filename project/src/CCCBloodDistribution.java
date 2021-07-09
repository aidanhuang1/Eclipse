import java.util.*;
import java.io.*;
public class CCCBloodDistribution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	//rh-negative
	//o negpatients, type a, type b

	//rh-pos
	//o pos, a, b,

	//ab neg, pos

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int total = 0;
		int oneg = readInt(), opos = readInt(), aneg = readInt(), apos = readInt(), bneg = readInt(), bpos = readInt(), abneg = readInt(), abpos = readInt();
		int poneg = readInt(), popos = readInt(), paneg = readInt(), papos = readInt(), pbneg = readInt(), pbpos = readInt(), pabneg = readInt(), pabpos = readInt();
		
		//negative
		//o
		while (oneg>0 &&poneg>0) {
			total++;
			oneg--;
			poneg--;
		}
		//o pos

		while (opos>0 &&popos>0) {
			total++;
			opos--;
			popos--;
		}
		while (oneg>0 &&popos>0) {
			total++;
			opos--;
			popos--;
		}
		
		//a neg
		while (aneg>0 &&paneg>0) {
			total++;
			aneg--;	
			paneg--;
		}
		while (oneg>0 &&paneg>0) {
			total++;
			oneg--;	
			paneg--;
		}
		
		
		//b neg
		while (bneg>0 &&pbneg>0) {
			total++;
			bneg--;
			pbneg--;
		}
		while (oneg>0 &&pbneg>0) {
			total++;
			oneg--;
			pbneg--;
		}




		//a pos
		while (apos>0 &&papos>0) {
			total++;
			apos--;
			papos--;
		}
		while (aneg>0 &&papos>0) {
			total++;
			aneg--;
			papos--;
		}
		while (opos>0 &&papos>0) {
			total++;
			opos--;
			papos--;
		}
		while (oneg>0 &&papos>0) {
			total++;
			oneg--;
			papos--;
		}

		//b pos
		while (bpos>0 &&pbpos>0) {
			total++;
			bpos--;
			pbpos--;
		}
		while (bneg>0 &&pbpos>0) {
			total++;
			bneg--;
			pbpos--;
		}
		while (opos>0 &&pbpos>0) {
			total++;
			opos--;
			pbpos--;
		}
		while (oneg>0 &&pbpos>0) {
			total++;
			oneg--;
			pbpos--;
		}



		//neg ab, pos ab


		while (pabneg>0) {
			boolean exit = false;
			if (oneg>0) {
				total++;
				oneg--;
				pabneg--;
				exit = true;
			}
			if (aneg>0) {
				total++;
				aneg--;
				pabneg--;
				exit = true;
			}
			if (bneg>0) {
				total++;
				bneg--;
				pabneg--;
				exit = true;
			}
			if (abneg>0) {
				total++;
				abneg--;
				pabneg--;
				exit = true;
			}
			if (!exit) break;
		}

		while (pabpos>0) {
			boolean exit = false;
			if (oneg>0) {
				total++;
				oneg--;
				pabpos--;
				exit = true;
			}
			if (aneg>0) {
				total++;
				aneg--;
				pabpos--;
				exit = true;
			}
			if (bneg>0) {
				total++;
				bneg--;
				pabpos--;
				exit = true;
			}
			if (abneg>0) {
				total++;
				abneg--;
				pabpos--;
				exit = true;
			}
			if (opos>0) {
				total++;
				opos--;
				pabpos--;
				exit = true;
			}
			if (apos>0) {
				total++;
				apos--;
				pabpos--;
				exit = true;
			}
			if (bpos>0) {
				total++;
				bpos--;
				pabpos--;
				exit = true;
			}
			if (abpos>0) {
				total++;
				abpos--;
				pabpos--;
				exit = true;
			}
			if (!exit) break;
		}
		System.out.println(total);
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
