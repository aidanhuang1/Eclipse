package project;
import java.util.Arrays;
import java.util.Scanner;
public class CCCTimeontask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Time = sc.nextInt();
		int N = sc.nextInt();
		int totaltime = 0;
		int chorespassed = 0;
		int Chores[] = new int [N];
		for (int i=0; i<N; i++) {
			Chores[i] = sc.nextInt();
		}
		Arrays.sort(Chores);
		for (int i=0; i<N; i++) {
			totaltime += Chores[i];
			if (Time<totaltime) {
				break;
			}
			chorespassed++;

		}
		System.out.println(chorespassed);


	}

}
