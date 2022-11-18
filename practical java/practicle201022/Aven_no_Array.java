// WAP to enter even number in array and print in ascending order.
// // Mane Manisha.R
//20-10-2022.
package corejava;
import java.util.Arrays;
import java.util.Scanner;
 class Aven_no_Array {	
	private static int length;
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter the no :");
	  int n =sc.nextInt();
	
	  int arr[]=new int[n];
	 System.out.print(" enter the element :");
	 
	 for (int i=0;i<n;i++)
	 {
		arr[i]=sc.nextInt();
	 }
	 Arrays.sort(arr);
	 System.out.println("Even no is");
	 for(int j=0;j<n;j++)
	 { 
		 // using  if loop for cheak even no . 
		 if(arr[j] % 2==0)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println(" ");
		}
 }
	
 }
