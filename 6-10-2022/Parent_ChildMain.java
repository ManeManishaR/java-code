
// calling both methods;
// Author: Mane Manisha.R.
package corejava;

public class Parent_ChildMain {
	public static void main(String[]args){
		Parent P1 = new Parent("can i sing the song");
		Child C1= new Child ("speak:"+"let's start");
		Child C2= new Child ("dance:"+"ding dong ding");
		{
			System.out.println("can i sing the song");
		}
		{
			System.out.println( "speak:"+"let's start");
		}
		{
	    	  System.out.println( "dance:"+"ding dong ding");
	      }
	P1.display();
	C1.display();
	C2.display();
	 
}
}


    
	
	

	
	