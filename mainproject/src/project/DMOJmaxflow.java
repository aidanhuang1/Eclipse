package project;
import java.util.Scanner;
public class DMOJmaxflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			int N = sc.nextInt();
			int[] numbers = new int [N];
			for (int j=0; j<N; j++) {
				numbers[j] = sc.nextInt();
			}
			int largest = numbers[0];
			for (int j=1; j<N; j++) {
				if (numbers[j]>largest) {
					largest = numbers[j];
				}
			}
			System.out.println(largest);
			
		}

	}

}
