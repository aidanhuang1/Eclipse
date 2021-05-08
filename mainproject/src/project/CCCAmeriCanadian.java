package project;
import java.util.Scanner;
public class CCCAmeriCanadian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			String a = sc.next();
			if (a.equals("quit!")) {
				break;
			}

			if (a.length()>4) {
				if (a.endsWith("or")) {
					if (a.charAt(a.length()-3)!='a' && a.charAt(a.length()-3)!='e' &&a.charAt(a.length()-3)!='i' &&a.charAt(a.length()-3)!='o' &&a.charAt(a.length()-3)!='u')  {
						a=a.replace("or", "our");
					}
				}
			}
			System.out.println(a);
		}


	}

}
