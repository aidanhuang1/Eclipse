package project;
import java.util.*;
public class CCCArt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		for (int i=0; i<N; i++) {
			String a = sc.next();
			String line[] = a.split(",");
			X[i] = Integer.parseInt(line[0]);
			Y[i] = Integer.parseInt(line[1]);
		}
		Arrays.sort(X);
		Arrays.sort(Y);
		System.out.printf("%d,%d%n",X[0]-1,Y[0]-1);
		System.out.printf("%d,%d%n",X[N-1]+1,Y[N-1]+1);

	}

}
