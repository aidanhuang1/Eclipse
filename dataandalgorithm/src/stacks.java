import java.util.*;
public class stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<String> stack1 = new Stack<String>();
		stack1.push("yes"); // Push adds element to the top
		stack1.push("no");
		System.out.println(stack1.peek()); // Peek is used to see what element is at the very top
		stack1.pop(); // Pop removes element at the top
		System.out.println(stack1);
		
	}

}
