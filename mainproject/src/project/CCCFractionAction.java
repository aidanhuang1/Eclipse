package project;
import java.util.*;
public class CCCFractionAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numerator = sc.nextInt();
		int denominator = sc.nextInt();
		int whole = 0;
		while(numerator>=denominator) {
			numerator-=denominator;
			whole++;
		}
		if (whole!=0) {
			System.out.print(whole+" ");
		}
		if (numerator!=0) {
			while (true) {
				if (numerator % 2==0 && denominator % 2==0) {
					numerator/= 2;
					denominator/=2;
				} else if (numerator % 3==0 && denominator % 3==0) {
					numerator/= 3;
					denominator/=3;
				} else if (numerator % 5==0 && denominator % 5==0) {
					numerator/= 5;
					denominator/=5;
				} else if (numerator % 7==0 && denominator % 7==0) {
					numerator/= 7;
					denominator/=7;
				} else {
					break;
				}
			}
			System.out.println(numerator+"/"+denominator);
		}

	}

}
