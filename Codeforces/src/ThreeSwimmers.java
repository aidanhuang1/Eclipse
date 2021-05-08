import java.util.*;
public class ThreeSwimmers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++) {
			Double p = sc.nextDouble(), a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
			int first = (int)Math.ceil(p/a);
			int second = (int) Math.ceil(p/b);
			int third = (int)Math.ceil(p/c);
			int min = Integer.MAX_VALUE;
			min = (int) Math.min(min, (first*a)-p);	
//			System.out.println(min);
			min = (int) Math.min(min, (second*b)-p);
//			System.out.println(min);
			min = (int) Math.min(min, (third*c)-p);
			System.out.println(min);
		}

	}

}
