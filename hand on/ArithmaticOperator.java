// Create program to check eligibility  age of person for voting.
//Author -Mane Manisha.R 
package corejava;
import java.util.Scanner;
class ArithmaticOperator {
	public static void main(String[] args) {
		// print the  1 st no.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:");
	     int i = sc.nextInt();
	     
	// print the 2 nd no .
			System.out.println("Enter 2nd no :");
		     int j = sc.nextInt();
		     sc.close();
		     // writing  the operation.
		     int add, sub,mul,div,mod;
		     add=i+j;
		     sub=i-j;
		     mul=i*j;
		     div=i/j;
		     mod=i%j;
		     // printing the values.
		     System.out.println("Addtion:"+add);
		     System.out.println("Substraction:"+sub);
		     System.out.println("Multiplication:"+mul);
		      System.out.println("Division:"+div);
		      System.out.println("Modulion:"+mod);
		      
	}

}
