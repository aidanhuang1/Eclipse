import java.util.*;
public class CookieJars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), C = sc.nextInt(), Q = sc.nextInt();
		int[] jars = new int[N+1];
		for (int i=0; i<N+1; i++) {
			jars[i] = C;
		}
		int totalc = N*C;
		
		for (int i=0; i<Q; i++) {
			int n = sc.nextInt();
			for (int j=0; j<N+1; j++) {
				if (j%n==0 && jars[j]>0 && j!=0) {
					jars[j]--;
					totalc--;
				}
			}
		}
		System.out.println(totalc);

	}

}
