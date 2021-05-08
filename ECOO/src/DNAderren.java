import java.util.*;
public class DNAderren {
	
	public static boolean check(String x) {
		if (x.equals("A") || x.equals("E") || x.equals("E") || x.equals("O") || x.equals("U")) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String[] sequence = n.split("");
		for (int i=0; i<sequence.length-1; i++) {
			System.out.print(sequence[i]);
			if ((!check(sequence[i]) && !check(sequence[i+1])) || (check(sequence[i]) && check(sequence[i+1]))) {
				System.out.print(" ");
			}
		}
		System.out.println(sequence[sequence.length-1]);
		
	
	}

}
