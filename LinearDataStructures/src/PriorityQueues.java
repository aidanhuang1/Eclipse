import java.util.*;
import java.io.*;
public class PriorityQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Creating empty priority queue (smallest element is in the head)
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		
		//Empty priority queue in reverse (the largest element is in the head)
        PriorityQueue<Integer> pQueuereverse = new PriorityQueue<Integer>(Collections.reverseOrder());
       

        // Adding items to the pQueue using add()
        pQueue.add(10); //head
        pQueue.add(20);
        pQueue.add(30);
        pQueue.add(40); //tail
 
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
 
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
 
        // Printing the top element again
        System.out.println(pQueue.peek());
        
        
        pQueuereverse.add(10); //tail
        pQueuereverse.add(20);
        pQueuereverse.add(40);
        pQueuereverse.add(30); //head
        
        System.out.println();
        System.out.println(pQueuereverse.poll());

	}

}
