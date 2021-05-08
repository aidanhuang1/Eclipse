package CanStem;

public class database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer Mary = new customer("Mary", "123456", 100, 100);
		System.out.println(Mary.getName());
		Mary.setName("a");
		System.out.println(Mary);
		System.out.println(Mary.getbalance());

	}

}
