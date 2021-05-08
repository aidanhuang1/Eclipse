import java.util.*;
public class TootsieRolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N < 3) {
			System.out.println("Rocket!");
		} 
		else if (N>7) {
			System.out.println("Tootsie Roll!");
		} else {
			System.out.println("NO");
		}

	}

}
