
public class Humantester {
	public int number;
	private String letters;
		
		public Humantester() {
			number = 0;
			letters = "hey";
			System.out.println("ok then");
		
		}
		
		public Humantester(String name, int age) {
			letters = name;
			number = age;
		}
		
		public String getname() {
			return letters;
		}
		public int getnumber() {
			return number;
		}
		public void setname(String a) {
			letters = a;
		}
		
		public String toString() {
			return "the name is: "+letters+"\nthe age is: "+number;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
