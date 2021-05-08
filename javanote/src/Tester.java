import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Humantester ok = new Humantester();
		
		ok.number = 32;			
		Humantester ok1 = new Humantester("josh", 23);
		
		System.out.println(ok.getnumber());
		
		ok.setname(sc.next());
		
		System.out.println(ok.getname());
		System.out.println(ok.toString());

		


	}

}
