import java.util.*;
import java.io.*;

/* Remember, Max-Heaps have the root node being the largest. Min-Heaps have the root node being the smallest.
 * We will use a Min-Heap in this source code
 */

public class Heaps {
	
	private static int capacity = 10;
	private int size = 0;
	
	static int[] data = new int[capacity];
	
	//Prints the index of child/parent
	private int getLeftChildIndex(int index) { return 2*index + 1; }
	private int getRightChildIndex(int index) { return 2*index + 2; }
	private int getParentIndex(int index) { return (index-1)/2; }

	//True or false if there is a child/parent
	private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
	private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }
	private boolean hasParent(int index) { return getParentIndex(index) >= 0; }
	
	//Print the data of child/parent
	private int leftChild(int index) { return data[getLeftChildIndex(index)]; }
	private int rightChild(int index) { return data[getRightChildIndex(index)]; }
	private int parent(int index) { return data[getParentIndex(index)]; }

	
	//Swaps node
	public static void swap(int indexone, int indextwo) {
		int temp = data[indexone];
		data[indexone] = data[indextwo];
		data[indextwo] = temp;
	}
	
	
	public void ensureCapacity() {
		if (size == capacity) {
			data = Arrays.copyOf(data, capacity * 2);
			capacity *= 2;
		}
	}
	
	public int peek() {
		if (size==0) { throw new IllegalStateException(); }
		return data[0];
	}
	
	public int poll() {
		if (size==0) { throw new IllegalStateException(); }
		int item_data = data[0];
		data[0] = data[size-1];
		this.size--;
		heapifyDown();
		return item_data;
	}
	
	public void add() {
		ensure
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	}

}
