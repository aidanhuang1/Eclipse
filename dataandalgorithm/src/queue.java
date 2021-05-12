import java.util.*;
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue works as First in First out
		
		//Queue queue1 = new Queue does not work because queue is an interface and cannot be instantiated.
		Queue<Integer> queue1 = new LinkedList<Integer>();
		//.add to add to the back
		queue1.add(12);
		queue1.add(24);
		queue1.peek(); //peek the head of the queue
		System.out.println(queue1);
		queue1.remove(); //To remove the head (first) you can do .remove or .poll, they work the same.
		queue1.poll();
		System.out.println(queue1);


		
		
	}

}
