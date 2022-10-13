// Create program to  bitwise.
	//Author -Mane Manisha.R 
package corejava;
import java.util.Scanner;
 class Bitwise {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 st the name:");
		     int num1= sc.nextInt();
		    
				System.out.println("Enter 2nd the name:");
			     int num2 = sc.nextInt();
			     sc.close();
			     // Bitwise AND operator.
			     System.out.println("num1&num2="+(num1&num2));
			     //0110
			     //0101
			     //------
			     //0100=4
			     //Bitwise Operator.
			     System.out.println("num1|num2="+(num1|num2));
			     //0101
			     //0110
			     //-----
			     //0111=7
			     //Bitwise XOR Operator.
			     System.out.println("num1^num2="+(num1^num2));
			     //0110
			     //0101
			     //----
			     //0011=3	    
		}
	}


