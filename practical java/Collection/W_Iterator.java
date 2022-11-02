// WAP to iterate ArrayList.
// Mane Manisha.R.
// 1-11-2022

package collection;
import java.util.*;
class W_Iterator {
	public static void main(String[] args) {
		ArrayList<String> Cars= new  ArrayList <>();
		// taking input .
		Cars.add("BMW");
		Cars.add("Scoda");
		Cars.add("Suzuki");
		
		 System.out.println(" Cars  are :"+Cars);
		 // calling iterate () method.
		 Iterator<String> Cars2 = Cars.iterator();
		 System.out.print("ArrayList using Iterator:"+Cars);
		 while(Cars2.hasNext());
			 // hasnext is using to cheak next value 
		 {
		 System.out.print(Cars2.next());
		
		 System.out.print(",");
	}
}
}
