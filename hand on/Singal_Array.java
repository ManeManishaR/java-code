// cerate program to define length of Array.
// Mane Manisha.R
//14-10-2022
package corejava;
import java.util.Scanner;
class Singal_Array {
	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      // entering the length of Array.
      
      System.out.println("enter the length of Array:");
      int s = sc.nextInt(); 
      // declaration and instantiation 
      int a[]= new int[s];
      for  (int i =0;i<a.length;i++) {
    	  // using loop for input user
    	  System.out.println("enter"+i + "num of Array :");
            int b= sc.nextInt();
            a[i]=b;
      }
      
	}
    	  
	}

