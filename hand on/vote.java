// Create program to check eligibility  age of person for voting.
//Author -Mane Manisha.R 
package corejava;

import java.util.Scanner;
public class vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
	     int x = sc.nextInt();
	      
	     if(x>=18) {
	     System.out.println("Congrats:you are Aligible for Vote ");
	}
	else
	{
		System.out.println("Sorry :you are not Aligible for Vote");
	      
	}
	  
	}
}
