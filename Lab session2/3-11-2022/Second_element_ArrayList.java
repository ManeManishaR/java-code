// WAP to replace the second element of ArrayList  with the element.
//Mane Manisha.R
//3-11-2022
package collection;
import java.util.ArrayList;

class Second_element_ArrayList {
	public static void main(String[] args) {
		// create object= colour to take name of colour
ArrayList<String> colour = new ArrayList<String>();
// taking name of colour.
         colour.add("Red");
         colour.add("Green");
         colour.add("pink");
         //  take first element to print.
  System.out.println(" This are my fev colours : "+colour);
  // create new String to add new colour.
         String new_colour="Black";
       // take colour.set() to add new colour name with size of index.  
  colour.set(2,"Black");
  int a =colour.size();
  // Replace  pink colour name  with Black colour name.
  System.out.println("Replace second element with ==> 'Black'.");
  for (int i=0; i<a;i++) {
	  // to get print .
	  System.out.println(colour.get(i));
  }
	}

}
