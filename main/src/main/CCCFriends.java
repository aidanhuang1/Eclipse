package main;
import java.util.*;
public class CCCFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] friends = new int [10000];
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			friends[x] = sc.nextInt(); //x is the person that must be friends with what friends[x] is equals to. For ex, friends[1] = 2
		}
		boolean samecircle; //if both friends in same circle
		int distance;
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt();
			samecircle = false;
			distance = 0;
			if (a==0 && b==0) {
				break;
			} else {
				for (int i=0; i<friends.length; i++) {

					System.out.println(b+" friendsb:"+friends[b]);
					if (friends[a]==b) {
						samecircle = true;
						break;
					} else {
						distance++;
						b = friends[b]; //cycles through the friend circle

					}
				}
			}
			if (samecircle) {
				System.out.println("yes "+distance);
			} else {
				System.out.println("no");
			}

		}

	}
}