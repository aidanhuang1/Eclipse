import java.util.*;
import java.io.*;
public class CCCWaterpark {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int MOD = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer>[] map = new ArrayList[N];
        for (int i=0; i<N; i++) {
            map[i] = new ArrayList<Integer>();
        }
        int[] path = new int[N];
        while (true) {
            int bv = sc.nextInt()-1;
            int ev = sc.nextInt()-1;
            if (bv==-1 && ev==-1) {
                break;
            }
            map[bv].add(ev);
        }
        
        path[0] = 1; //because we are starting at 1 and we are already there
        for (int r=0; r<N; r++) {
            for (int c=0; c<map[r].size();c++ ) {
                path[map[r].get(c)] = path[r] + path[map[r].get(c)];
            }
        }
       
        System.out.println(path[N-1]);
	}
}
