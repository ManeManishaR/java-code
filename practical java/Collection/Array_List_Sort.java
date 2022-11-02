// WAP to sort Array list in Descending order.
// Mane Manisha .R
//1-11-2022
package collection;
import java.util.ArrayList;
import java.util.Collections;

class Array_List_Sort {
	
	public static void main(String[] args) {
		ArrayList<String> Name = new ArrayList<String>();
		 Name.add("chiku");
		 Name.add("mau");
		 Name.add("teju");
	
		 System.out.println("My Friends are  :"+Name);
		
	Collections.sort(Name);
		 // print the sorted Arraylist.
	Collections.reverse(Name);
	System.out.println("Sorted in Descending Order :"+Name) ;
		 System.out.println();
		 
	}

}
