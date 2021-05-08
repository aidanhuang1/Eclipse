package CanStem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CCCart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<point> al = new ArrayList<point>();
		point p = new point(); //put point p = new point(); inside for loop other it will have the same
		String a = "";
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			a = sc.next();
			String[] xy = a.split(",");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			p.changeX(x);
			p.changeY(y);
			al.add(new point(x,y));
		}
		int[] xarray = new int [n];
		int[] yarray = new int [n];
		for (int i=0; i<n; i++) {
			xarray[i] = al.get(i).getX();
			yarray[i] = al.get(i).getY();
		}

		Arrays.sort(xarray);
		Arrays.sort(yarray);
		System.out.println((xarray[0]-1)+","+(yarray[0]-1));
		System.out.println((xarray[n-1]+1)+","+(yarray[n-1]+1));
	}
}


