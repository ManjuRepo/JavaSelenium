package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// adding pairs
		hm.put(01, "Person1");
		hm.put(02, "Person2");
		hm.put(03, "Person3");
		hm.put(04, "Person4");
		hm.put(01, "Person1");

		// Print
		System.out.println(hm);
		System.out.println("Size of Hash Map : " + hm.size());

		// Remove pair
		hm.remove(02); // 02 is the key value
		System.out.println("After Remove : " + hm);

		// Fetch pair
		System.out.println(hm.get(04));

		// get all key
		System.out.println(hm.keySet());// key values

		// get all values
		System.out.println(hm.values());

		// get all key & values
		System.out.println(hm.entrySet());// {}>>represent list | [] represent set
		
		//reading data from hash map for loop not supported
		
		for(Object x:hm.entrySet().) {
			System.out.println(x);
		}
		
		Iterator<Entry<Integer, String>> p = hm.entrySet().iterator();
		while (p.hasNext()) {
			System.out.println(p.next());
		}
	}

}
