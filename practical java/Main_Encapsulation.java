// Capsulation Programme
//Author Mane Manisha.R
package incapsulation;

 class Main_Encapsulation {
public static void main(String[]args) {
	Encapsulation e = new Encapsulation();
	// calling setter method using object of class.
	e.setId(10);
	e.setName("manisha");
	e.setAge(25);
	// calling getters method using object of class.
	System.out.println("id is :"+e.getId());
	System.out.println("name is :"+e.getName());
	System.out.println("age is :"+e.getAge());
	
	
}
}
