// WAP to check if a particular element exists in a linkedlist.
// //Mane Manisha.R
//3-11-2022
package collection;
import java.util.*;
class Exists_LinkedList {

	public static void main(String[] args) {
	LinkedList<String> obj1 = new LinkedList<String>();
	obj1.add("Potato");
	obj1.add("Tomato");
	obj1.add("Pea");
	 System.out.println( "Vegetables are :"+obj1);
	 LinkedList<String> fruit = new LinkedList<String>();
	 fruit.add("apple");
	// calling iterator () method.
	 
	 Iterator<String> obj2= obj1.iterator();
	{
		 System.out.println(obj2.hasNext());
		
	 }
	  // 
	
}
}

	 


