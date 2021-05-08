import java.util.*;
public class manymessages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int interval = sc.nextInt();
		int larry = sc.nextInt();
		boolean found = false;
		for (int i=1; i<=3; i++) {
			if (larry<=(start+(i*interval))) {
				System.out.println(start+(i*interval));
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Who knows...");
		}

	}

}
