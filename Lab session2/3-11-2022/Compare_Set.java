/*WAP to compare two sets and retain elements which are same on both
 * sets .
 * Mane Manisha.R
   3-11-2022
 */
package collection;
import java.util.*;

 class Compare_Set {
	public static void main(String[] args) {
		// creating first set to take give an object.
		HashSet<String> obj1 = new HashSet<String>();
		obj1.add("Meena");
		obj1.add("Seema");
		obj1.add("Leena");
		obj1.add("Minu");
		obj1.add("Priya");
		//first set to print .
		System.out.println(" Friends Name are :"+obj1);
		// create second set to compare with first set.
		HashSet<String> obj2 = new HashSet<String>();
		obj2.add("Meena");
		obj2.add("Minu");
		obj2.add("Priya");
		// calling retainAll () method to check.
		obj1.retainAll(obj2);
		// to print 
		System.out.println(" Hash set using iterate:");
			System.out.println(obj1);
		}
	}
