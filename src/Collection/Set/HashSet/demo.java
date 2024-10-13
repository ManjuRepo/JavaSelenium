package Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration
		// HashSet hs = new HashSet(); //allow heterogeneous type of data
		// Set hs = new HashSet(); //allow heterogeneous type of data
		// HashSet<String> hs = new HashSet<String>(); //allow homogeneous type of data
		/*
		 * HashSet<Sample> hs = new HashSet<Sample>(); //allow homogeneous type of data
		 * if Sample class is created
		 */

		// Declaration
		HashSet hs = new HashSet();

		// Add data into Hash Set
		hs.add("Abcd");
		hs.add(100);
		hs.add(200.3);
		hs.add('l');
		hs.add(null);
		hs.add("Abcd");
		hs.add(100);
		hs.add(null);

		// Print elements in Hash Set
		System.out.println("size of Hash set : " + hs.size());
		System.out.println(hs);
		/*
		 * [null, 200.3, 100, l, Abcd] Observe here duplicates are not allowed & not
		 * stored in index order
		 */

		// Removing elements from Hash set here we have to directly pass the values
		hs.remove(null);
		System.out.println(hs);

		// insert or access specific element is not possible
		// convert hash set to array list
		ArrayList arr = new ArrayList(hs);
		System.out.println(arr); // insert or access specific element is possible

		// In Hash Set normal for loop is not

		for (Object x : hs) {
			System.out.println(x);
		}

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		// remove all from hash set
		hs.clear();
		System.out.println(hs);

	}

}
