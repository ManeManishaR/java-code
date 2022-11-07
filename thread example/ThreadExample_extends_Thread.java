package test;

 class ThreadExample_extends_Thread {

	public static void main(String[] args) {
	Thread t1= new Thread();
	t1.start();
	System.out.println("Thread has created with name:"+t1.getName());
	}
	
}
