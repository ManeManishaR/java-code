// WAP to Elements Array in Ascending and Dscending order.
// Mane Manisha.R
//20-10-2022.
package corejava;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 class Ascending_dscending_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] array =new Integer[5];
		 
		int i;
		System.out.println("Enter 5 no of alements array:");	 
	for(i=0;i<5;i++)
	{
		array[i]= sc.nextInt();
	}
	// to arrange arrays in ascending order we used sort method.
	Arrays.sort(array);
	// printing original array.
	System.out.println("Array in Ascending order :"+Arrays.toString(array));
	 {
		// sort the array in descending order.
		 Arrays.sort(array,Collections.reverseOrder());
		 System.out.println("Array in Descending order:"+Arrays.toString(array));
	 }
	
	}


}
