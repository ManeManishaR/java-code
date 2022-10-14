//WAP to demonstrate on nested if.input take from user.
// Mane Manisha.R
//13-10-2022
package corejava;

import java.util.Scanner;

public class Input_User {

	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = sc.nextInt();
		sc.close();
               //using if loop
			// taking input 
		if (n>5) {
			System.out.println("done");
		}
//using else loop.
		else{ 
		
			System.out.println("plz check = no");
		}
	}

}
