// Create program to check Marks.
//Author -Mane Manisha.R 
package corejava;
import java.util.Scanner;
public class Marks {
	private static int x;
	// add subject name.
	  String Hindi;  ;
	  String Marathi;
	  String English;
	  String Math;
	  String History;
// print the name,marks.
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		 sc.next();
	  
	     
	     System.out.println("Enter the Marks of five subj:");
	     int i = sc.nextInt();
	     sc.close();
	 if(i>=60) {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("false");
	 }

}
}
		      
    
	
	