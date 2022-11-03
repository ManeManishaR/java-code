/*WAP  to get the element in tree set which is strictly greater than 
 * or equal to the given element.
 * Mane Manisha.R
   3-11-2022
 */
package collection;

import java.util.TreeSet;

class Tree_Set_Greaterthan {
	public static void main(String[] args) {
		TreeSet<Integer> No= new TreeSet<Integer> ();
		// adding no in the tree.
		No.add(20);
		No.add(30);
		No.add(40);
		No.add(50);
		No.add(60);
	System.out.println( "Greater than or equal to  55:"+No.ceiling(55));
		System.out.println("Greater than or equal to 25 :"+No.ceiling(25));
	}

}
