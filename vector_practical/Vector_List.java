package corejava;

import java.util.Vector;

class Vector_List {
	public static void main(String[] args) {
		Vector<String> obj1= new Vector<>();
	// using the add ()method.
		obj1.add("Manisha ");
		obj1.add(" Mayur");
		// using index number.
		obj1.add(2, "Chavahan");
		
		System.out.println("Vector"+obj1);
		// using add all () method
		Vector<String> obj2= new Vector<>();
		obj2.add("Ashu");
		obj2.add("Teju");
		obj2.add("mani");
        obj2.addAll(obj1);

      System.out.println("New Vector :"+ obj2);
		
	}
	

}
