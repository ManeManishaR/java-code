package corejava;

import java.util.ArrayDeque;

public class Array_Dequeue{

	public static void main(String[] args) {
		ArrayDeque<String> obj1 = new ArrayDeque<>();
		obj1.add("nita");
		obj1.add("anita");
		obj1.add("vnita");
		 //using addfirst()method.
		obj1.addFirst("Manisha");
		// using last ()method.
		obj1.addLast("Chaya");
		
		System.out.println("Array Deque :"+obj1);
	}

}
