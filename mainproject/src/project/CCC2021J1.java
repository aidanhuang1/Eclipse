package project;
import java.util.*;
import java.io.*;
public class CCC2021J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int formula = (5*B)-400;
		System.out.println(formula);
		if (formula==100) {
			System.out.println(0);
		} else if (formula>100) {
			System.out.println(-1);
		} else if (formula<100) {
			System.out.println(1);
		}
	}

}
