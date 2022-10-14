//Create program to while loop.
//Author Mane Manisha.R
package corejava;
import java.util.Scanner;
public class Do_while {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int num = sc.nextInt();
		sc.close();
		
		// Text statement.
		do
		{
			System.out.println("welcome : in java");
			num--;
			break;
		}
		// check condition.
		while(num <2);
	    System.out.println("false");
	}

}
