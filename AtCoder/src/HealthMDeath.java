import java.util.*;
public class HealthMDeath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), H = sc.nextInt();
		if (H%M==0)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}
