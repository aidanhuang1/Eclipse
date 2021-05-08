import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Coins {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = sc.nextInt(), X = sc.nextInt();
		int max = 0;
		for (int i=0; i<N; i++) {
			int A = sc.nextInt(), V = sc.nextInt();
			if (A>=X) {
				max = Integer.max(max, X*V);
			} else {
				max = Integer.max(max, A*V);
			}
		}
		System.out.println(max);

	}

}
