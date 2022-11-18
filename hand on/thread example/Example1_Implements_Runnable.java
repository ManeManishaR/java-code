package test;

public class Example1_Implements_Runnable {

	public static void main(String[] args) {
		Thread Example1 = new Thread ("demo 1");
		Thread Example2 = new Thread ("demo 2");
		Example1.start();
		Example2.start();
		System.out.println("Thread names are follwing :");
		System.out.println(Example1.getName());
		System.out.println(Example2.getName());
		}
	public void run () {
		
	}
	

}
