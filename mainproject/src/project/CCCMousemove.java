package project;
import java.util.*;
import java.io.*;
public class CCCMousemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), r = sc.nextInt();
		int xpos = 0, ypos = 0;
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x==0 && y==0) {
				break;
			} else {
				xpos += x;
				ypos += y;
				if (xpos < 0) {
					xpos = 0;
				}
				else if (xpos > c) {
					xpos = c;
				}
				if (ypos < 0) {
					ypos = 0;
				}
				else if (ypos > r) {
					ypos = r;
				}
			}
			System.out.println(xpos+" "+ypos);
		}
	}

}
