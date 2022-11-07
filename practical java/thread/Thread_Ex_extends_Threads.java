package Threads;

public class Thread_Ex_extends_Threads 
{
	public static int amount=0;
	public static void main(String[] args) 
	{
	Thread te=new Thread();
	te.start();
	System.out.println(amount); 
	amount++;   
	System.out.println(amount);

	}
	public void run()
	{
	amount++; 
	}

}

