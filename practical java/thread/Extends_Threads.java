package Threads;

public class Extends_Threads {

	public static void main(String[] args) {
		Main thread= new Main();
		thread.start();
		System.out.println(" this course is :");
	}
	public void run()
	{
		System.out.println("this course is :");
	}

}
