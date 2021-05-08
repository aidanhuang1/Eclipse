import java.util.*;
public class NextRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), count = 0;
		int[] participants = new int[n];
		for (int i=0; i<n; i++) {
			participants[i] = sc.nextInt();
		}
		k = participants[k-1];
		for (int i=0; i<n; i++) {
			if (participants[i]>=k && participants[i]>0) {
				count++;
				
			}
		}
		System.out.println(count);
	}	

}
