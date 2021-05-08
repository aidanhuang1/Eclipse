
public class questiomarkcolonoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* (a > b) ? a : b; is an expression which returns one of two values, a or b.
		The condition, (a > b), is tested. If it is true the first value, a, is returned. 
		If it is false, the second value, b, is returned. 
		Whichever value is returned is dependent on the conditional test, a > b.
		The condition can be any expression which returns a boolean value.
		 */
		
		int a = 10;
		int b = 12;
		System.out.println((a<b) ? a:b); //in this case, b is greater than a, so the first variable a will be outputted
		System.out.println((a>b) ? a:b);
		System.out.println((a<b) ? "B is greater than A":"A is greater than B");
	}

}
