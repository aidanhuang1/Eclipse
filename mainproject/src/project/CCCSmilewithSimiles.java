package project;
import java.util.Scanner;
public class CCCSmilewithSimiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String adject[] = new String[N];
		String noun[] = new String[M];
		for (int i=0; i<N; i++) {
			adject[i] = sc.next();
		}
		for (int i=0; i<M; i++) {
			noun[i] = sc.next();
		}
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				System.out.println(adject[i]+" as "+noun[j]);
			}
			
		}

	}

}
