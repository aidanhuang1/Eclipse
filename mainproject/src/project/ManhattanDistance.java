package project;
import java.util.Scanner;
import java.lang.Math;
public class ManhattanDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.print(Math.abs(x2-x1)+Math.abs(y2-y1));
		
		sc.close();
		}

	}



