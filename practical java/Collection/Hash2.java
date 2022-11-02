/* creating Linked Hashset from Array set
 * 
 */
package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Hash2 {

	public static void main(String[] args) {
		ArrayList<Integer> obj1 = new ArrayList<>();
		// using Integer () method .
		obj1.add(20);
		obj1.add(30);
		
		System.out.println(" ArrayList  value is :"+ obj1);
		// creating list hashset from an Arraylist.
		LinkedHashSet<Integer> obj2 = new LinkedHashSet <>(obj1);
		System.out.println("LinkedHashSet is : "+ obj1);
		
	}

}
