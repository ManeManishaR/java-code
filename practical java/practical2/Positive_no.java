//WAP TO PRINT SUM OF ONLY POSITIVE NO USING DO WHILE LOOP .
// Mane Manisha.R
// 13-05-2022
package corejava;
import java.util.Scanner;
 class Positive_no {
	private static int x;

	public static void main(String[] args) {
		// create Scanner class of object.
		  Scanner sc =new Scanner(System.in);
		
            int x = 0;
           int sum =0;
	
  {
// using do while loop 
  do {
	  // add only positive numbers sum+numbers;
	  System.out.println("Enter a no :");
	  x = sc.nextInt();
	  
  // using while loop;
  
    if(x>=0){
	  sum= sum+ x;
  }
  } while(x>=0);
  	 System.out.println();
	  System.out.println("num of positive="+sum);
	  }
  }
 }

	  

