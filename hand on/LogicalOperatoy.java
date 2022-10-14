// Create program to check logical operator..
//Author -Mane Manisha.R 
package corejava;
import java.util.Scanner;

 class LogicalOperatoy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 st the name:");
	     int num1= sc.nextInt();
	    
			System.out.println("Enter 2nd the name:");
		     int num2 = sc.nextInt();
		     
		     System.out.println("Enter 3rd the name:");
		     int num3= sc.nextInt();
		     
		     System.out.println("performing AND Operator:");
		     //using logical operator.AND TO Verify .
		     
		     if( (num1<num2)&&(num2==num3))
		     {
		    	 int sum = num1+num2+ num3;
		    	 System.out.println("sum is :"+sum);
		     }
		     else
		     { 
		    	 System.out.println("false");
		     }
	}		     
		     
}
