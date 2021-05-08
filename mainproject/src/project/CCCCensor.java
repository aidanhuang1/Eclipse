package project;
import java.util.*;
public class CCCCensor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<=n; i++) {
			String a = sc.nextLine();
			String arr[] = a.split(" ");
			for (int j=0; j<arr.length; j++) {
				if (arr[j].length()==4) {
					System.out.print("**** ");
				} else {
					System.out.print(arr[j]+" ");
				}
			}
			System.out.print("\n");
		}
	}

}


