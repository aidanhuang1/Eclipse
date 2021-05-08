package project;
import java.util.Arrays;
import java.util.Scanner;

public class CCCSunflowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] sun = new int [N][N];
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				sun[i][i] = sc.nextInt();
			}
		}
		System.out.print(Arrays.toString(sun));
	}


}
