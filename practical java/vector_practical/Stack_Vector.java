package corejava;

import java.util.Stack;

class Stack_Vector {

	public static void main(String[] args) {
		Stack<String> obj1 = new Stack <>();
		// using push() method not using add but it work like push
		obj1.add("manisha");
		obj1.add("mane");
		
		System.out.println("Stack value :"+ obj1);
		// pop element from the top.
		obj1.pop();
		System.out.println("stack after pop :"+ obj1);
	}

}
