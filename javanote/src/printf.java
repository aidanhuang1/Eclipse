
public class printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double a1 = 10.1;
		String b = "abc";
		char c = 'c';
		// %n just means new line, the same as \n
		System.out.printf("%d%n",a); //prints out 10
		System.out.printf("%f%n",a1); 
		System.out.printf("%s%n",b);
		System.out.printf("%S%n",b);
		System.out.printf("%c%n",c);
		System.out.printf("%C%n",c);
		System.out.printf("%b%n",4>5);
		System.out.printf("%d%% of people did well on the test", a); //%% is %


	}

}
