// WAP to Sort Array in ascending order.
// Mane Manisha.R
//19-10-2022.
package corejava;
import java.util.Arrays;
import java.util.Scanner;
 class Sort_Array {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of alements array:");
	int size = sc.nextInt();
	 
	int x[]=new int[size];
	System.out.print("enter "+ size+  "element of an array");
	
for(int i=0;i<size;i++)
{
	x[i]= sc.nextInt();
}
// to arrange arrays in ascending order we used sort method.
Arrays.sort(x);
System.out.println("\nResult");
 for (int n:x)
 {
	 System.out.println(n+"");
 }
	}
}