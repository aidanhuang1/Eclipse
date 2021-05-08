package project;
import java.util.*;
public class CCCBoringBusiness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] borehole = new int [400][200];
		borehole[203][0] = 1;
		borehole[203][1] = 1;
		borehole[203][2] = 1;
		borehole[204][2] = 1;
		borehole[205][2] = 1;
		borehole[206][2] = 1;
		borehole[206][3] = 1;
		borehole[206][4] = 1;
		borehole[207][4] = 1;
		borehole[208][4] = 1;
		borehole[208][3] = 1;
		borehole[208][2] = 1;
		borehole[209][2] = 1;
		borehole[210][2] = 1;
		borehole[210][3] = 1;
		borehole[210][4] = 1;
		borehole[210][5] = 1;
		borehole[210][6] = 1;
		borehole[209][6] = 1;
		borehole[208][6] = 1;
		borehole[207][6] = 1;
		borehole[206][6] = 1;
		borehole[205][6] = 1;
		borehole[204][6] = 1;
		borehole[203][6] = 1;
		borehole[202][6] = 1;
		borehole[202][5] = 1;
		borehole[202][4] = 1;
		int pointx = 202;
		int pointy = 4;
		while (true) {
			boolean safe = true;
			char direction = sc.next().charAt(0);
			int length = sc.nextInt();
			if (direction=='q')  {
				break;
			}
			else if (direction=='d') {
				for (int i=0; i<length; i++) {	
					pointy++;
					if (borehole[pointx][pointy]==0) {
						borehole[pointx][pointy] = 1;
					} else {
						safe = false;
					}
				}
				System.out.println();
				System.out.print(pointx-203+" "+((-pointy)-1));
			}
			else if (direction=='u') {
				for (int i=0; i<length; i++) {
					pointy--;
					if (borehole[pointx][pointy]==0) {
						borehole[pointx][pointy] = 1;
					} else {
						safe = false;
					}
				}
				System.out.println();
				System.out.print(pointx-203+" "+((-pointy)-1));
			}
			else if (direction=='r') {
				for (int i=0; i<length; i++) {
					pointx++;
					if (borehole[pointx][pointy]==0) {
						borehole[pointx][pointy] = 1;
					} else {
						safe = false;
					}
				}
				System.out.println();
				System.out.print(pointx-203+" "+((-pointy)-1));
			}
			else if (direction=='l') {
				for (int i=0; i<length; i++) {
					pointx--;
					if (borehole[pointx][pointy]==0) {
						borehole[pointx][pointy] = 1;
					} else {
						safe = false;
					}
				}
				System.out.println();
				System.out.print(pointx-203+" "+((-pointy)-1));
			}
			
			if (!safe) { //DANGER
				System.out.print(" DANGER");
				break;
			} else if (safe) {  //safe
				System.out.print(" safe");
			}
		}
	}
}
