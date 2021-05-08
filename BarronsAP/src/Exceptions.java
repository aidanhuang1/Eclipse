
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try statement allows for a block of code to be tested for errors
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		} catch (Exception e) { //catch statement runs a block of code if an error occurs in the above code block
			System.out.println("Something went wrong.");
		} finally { //finally statement runs block of code regardless of the result
			System.out.println("The 'finally' is finished.");

		}
		//throw statement throws a custom error
		if (1==1) {
			throw new ArithmeticException("throws an error");
		}

	}

}
