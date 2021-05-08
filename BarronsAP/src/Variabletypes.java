
public class Variabletypes {
	
	public static int number = 2; //Instance variable, declared in a class but outside methods, constructors, or blocks
	
	public static int test() {
		int age = 1; //Local variable, declared in methods, constructors, or blocks
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test());
		System.out.println(number);
	}

}
