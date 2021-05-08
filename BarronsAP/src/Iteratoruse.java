import java.util.*;
public class Iteratoruse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//An iterator is an object whose sole purpose is to traverse a collection, one element at a time. During iteration
		//the iterator object maintains a current position in the collection, and is the controlling
		//object in manipulating the elements of the collection.
		
		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Get the iterator
		Iterator<String> it = cars.iterator();

		// Print the first item

		System.out.println(it.next());


	}

}
