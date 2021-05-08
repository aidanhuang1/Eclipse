package main;
import java.util.*;
public class DMOJwowmuchparkinglot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = 0, y = 0;
		for (int i=0; i<n; i++) {
			String direction = sc.next();
			int move = sc.nextInt();
			if (direction.equals("North"))
				y+=move;
			else if (direction.equals("East"))
				x+=move;
			else if (direction.equals("South"))
				y-=move;
			else if (direction.equals("West"))
				x-=move;
		}
		System.out.println(x+" "+y);
	}

}
