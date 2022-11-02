/*Tree set class implements set interface that uses a tree for storage.
 * it  inherits abstracts  set class an implement navigable set inteerface.
 * the obj of tree set of class are sorted in asscending order.
 * it contains unique  elements and does not allows null values.
 * 
 */
package collection;

import java.util.SortedSet;
import java.util.TreeSet;

class Tree_Set {
	public static void main(String[] args) {
		// using fruits for object.
		// taking input .
		SortedSet<String> fruits = new TreeSet<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("Pineapple");
		System.out.println("fruits are :"+fruits);		
		// duplicates elements are ignored 
		fruits.add("pineapple");
		System.out.println(" after adding duplicates elements :"+fruits);

	}

}
