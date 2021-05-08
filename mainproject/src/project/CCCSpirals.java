package project;
import java.util.*;
public class CCCSpirals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int[][] spiral = new int[11][11];
		int posx = 5;
		int posy = 5;
		int cycle = 0; 

		spiral[posx][posy] = x;
		boolean cont = true;
		while (x<=y) {
			if (!cont) {
				for (int i=0; i<spiral.length; i++) {
					for (int j=0; j<spiral.length; j++) {
						if (spiral[i][j]!=0) {
							System.out.print(spiral[i][j]+" ");
						}
					}
					System.out.println();
				}
				break;
			}

			//down
			cycle++;
			for (int i=0; i<cycle; i++) {
				if (x==y) {
					cont = false;
					break;
				}
				x++;
				posy++;
				spiral[posy][posx] = x;
			}

			//right
			for (int i=0; i<cycle; i++) {
				if (x==y) {
					cont = false;
					break;
				}
				x++;
				posx++;
				spiral[posy][posx] = x;
			}

			//up
			cycle++;
			for (int i=0; i<cycle; i++) {
				if (x==y) {
					cont = false;
					break;
				}
				x++;
				posy--;
				spiral[posy][posx] = x;
			}
			//left
			for (int i=0; i<cycle; i++) {
				if (x==y) {
					cont = false;
					break;
				}
				x++;
				posx--;
				spiral[posy][posx] = x;
			}

		}
	}

}
