
import java.util.Arrays;

public class testsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefgbasddddasdsa";
		String[] aa = a.split("d",0);
		for (String i : aa) {
			System.out.print(i);
		}

	}

}