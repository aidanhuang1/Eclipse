package project;
import java.util.*;
public class CCCFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] friends = new int [10000];
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			friends[x] = sc.nextInt();
		}
		boolean samecircle;		
		int distance;
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt();
			samecircle = false;
			distance = 0;
			if (a==0 && b==0) {
				break;
			} else {
				for (int i=0; i<friends.length; i++) {
					if (friends[a]==b) {
						samecircle = true;
						break;
					} else {
						a = friends[a];
						distance++;
					}
				}
			}
			if (samecircle) {
				System.out.print("\nYes "+distance);
			} else {
				System.out.print("\nNo");
			}
		}

		
		/* Array size 10000 friends is created, the array index consists of
		 * the first friend, and the array value at that index consists of 
		 * the second friend (otherwise an array[10000][10000]) would cause MLE.
		 * 
		 * In a while loop, if inputs a and b are 0, break
		 * 
		 * Checking throughout the entire length of the array (and break when the two friends are
		 * found in a same circle), see if the value of the index array equals the next friend, which then
		 * means they are next to eachother.
		 * 
		 * Otherwise, cycle through the friend circle and distance++
		 * 
		 * 
		 */

	}
}