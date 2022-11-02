/* linked hash set is an ordered and sorted collection and 
 * it mentains the insertion ordered of the element.
 * 
 */
package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Linked_Hashset {

	public static void main(String[] args) {
		LinkedHashSet<String> obj1 = new LinkedHashSet<>();
		// using add ()method
		obj1.add("manisha");
		obj1.add("neha");
		obj1.add("poja");
		System.out.println("LinkedHashset is :"+ obj1);
// calling  iterator()method 
		Iterator<String> obj2= obj1.iterator();
		
	}

}
