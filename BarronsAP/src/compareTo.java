
public class compareTo {

	public static boolean compare(String str1, String str2) {
		if (str1.compareTo(str2) == 0) {
			return true;
		} else {
			return false;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1.compareTo(str2));
		System.out.println(compare(str1, str2));
	}

}
