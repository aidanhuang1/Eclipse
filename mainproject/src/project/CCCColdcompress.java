package project;
import java.util.*;
public class CCCColdcompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			String a = sc.next();
			String letter = a.substring(0,1);
			int count = 0;
			for (int j=0; j<a.length(); j++) {
				if (letter.charAt(0)==a.charAt(j)) {
					count++;
				} else {
					System.out.printf("%d %s ",count,letter);
					letter = a.substring(j,j+1);
					count = 1;
				}
			}
            System.out.println(count + " " + letter + " ");
		}
	}

}

