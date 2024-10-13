package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList arr = new ArrayList(); //Hold Objects (hectogeneous)
		// List arr = new ArrayList(); //List(Interface) Parent of ArrayList
		// (hectogeneous)

		/*
		 * ArrayList<Integer> arr=new ArrayList<Integer>(); // By using data type can
		 * store homogeneous type of data
		 */

		/*
		 * ArrayList<Demo> arr = new ArrayList<Demo>(); // if any class created by name
		 * Demo it can hold the data from that class (homogeneous)
		 */

		// Deceleration
		ArrayList arr = new ArrayList();

		// Adding data into ArrayList
		arr.add(100);
		arr.add(100.999);
		arr.add("Java");
		arr.add('A');
		arr.add(null);
		arr.add("Java");

		// Print Size of array
		System.out.println("Size of Array : " + arr.size());

		// Printing ArrayList
		System.out.println("Values of Array : " + arr);

		// Remove element from Array list
		// If we know the index the we can remove the values
		System.out.println("Removed Value : " + arr.remove(2));
		System.out.println("Size of Array : " + arr.size());
		System.out.println("Values of Array : " + arr);

		// insert element in Array List
		arr.add(2, "Array List");// Value will me added in the specified index
		System.out.println("Size of Array : " + arr.size());
		System.out.println("Values of Array : " + arr);

		// (Modify/Replace/Change) element in the Array List
		arr.set(1, 200.2);// If we know the index the we can Modify the values
		System.out.println("Modified Values of Array : " + arr);

		// Access specific element
		// If we know the index the we can fetch the values
		System.out.println("Access specific element : " + arr.get(2));

		// Read all element using For loop
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		// Read all element using For each loop
		for (Object Print : arr) {
			System.out.println(Print);
		}

		/*
		 * using iterator it supports for all type of collections **Best Practices**
		 * when we don't know the size no need of break because hasNext will check next
		 * element is present or not is no value is available it will break here we can
		 * use wrapper Iterator <String> it = arr.iterator();
		 */
		Iterator it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// check Array list empty or not
		System.out.println("Is Array list is empty? : " + arr.isEmpty());

		// Remove All element from Array List we can use clear also
		arr.removeAll(arr);
		System.out.println("Is Array list is empty? : " + arr.isEmpty());
	}
}
