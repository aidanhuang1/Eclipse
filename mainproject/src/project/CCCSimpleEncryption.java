package project;
import java.util.*;
public class CCCSimpleEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String keyword = sc.nextLine(), message = sc.nextLine();
		message = message.replaceAll("[^A-Z]", "");
		int asciikeyword [] = new int [keyword.length()];
		int asciimessage [] = new int [message.length()];
		for (int i=0; i<keyword.length(); i++) {
			asciikeyword[i] = (int) keyword.charAt(i);
		}
		for (int i=0; i<message.length(); i++) {
			asciimessage[i] = (int) message.charAt(i);
		}
		int keywordrotates = 0;
		for (int i=0; i<asciimessage.length; i++) {
			if (keywordrotates>asciikeyword.length-1) {
				keywordrotates = 0;
			}
			asciimessage[i] = asciimessage[i]+(asciikeyword[keywordrotates]-65);
			if (asciimessage[i]>90) {
				asciimessage[i] = asciimessage[i] - 26;
			}
			keywordrotates++;
		}
		for (int i=0; i<asciimessage.length; i++) {
			System.out.print((char) asciimessage[i]);
		}
	}

}
