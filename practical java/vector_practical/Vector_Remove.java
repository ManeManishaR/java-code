package corejava;

import java.util.Vector;

class Vector_Remove {

	public static void main(String[] args) {
		Vector<String> obj1= new Vector<>();
		// using the add ()method.
			obj1.add("manisha");
			obj1.add("smital");
			obj1.add("shradha");
			
			
			// using index number.
			obj1.add(2,"Asmi");
			System.out.println("Vector"+obj1);
			// using remove()method 
			String s= obj1.remove(3);
			System.out.println("remove element :"+ s);
			System.out.println("New Vector :"+ obj1);
			
			
		// using clear () method .
			obj1.clear();
			System.out.println("Vector after :"+ obj1);
	}

}
