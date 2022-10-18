// WAP to 2D_Matrix addition.
// Mane Manisha.R
//17-10-2022
package corejava;
import java.util.Scanner;
 class Multi_2D {
	public static void main(String[] args) {
		int i,j,a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("No of Rows :");
		// taking input for row .
		  a =sc.nextInt();
		System.out.println("No of Column:");
		// taking input for column.
		b= sc.nextInt();
		// display 2-d matrix.
		int array[][]=new int[a][b];
		// reading the matrix value.
		System.out.println("enter the element array :");
		// using  for loop for row.
		for (i=0;i<a;i++)
		{
	     	for ( j=0; j<b; j++)
		{
		 array[i][j]=sc.nextInt();
		//accessing values.
		}
		System.out.println(" 1 st Element Matrix  Array : ");
		for (i=0;i<a;i++)
			// print arrays values.
		{
			for(j=0;j<b;j++)
			{
				System.out.print(array[i][j]+ " ");
			}
			// 2 array.
		System.out.println();
		//  adding second  array .
		System.out.println("No of 2 Rows :");
		// taking 2 input for row .
		  a =sc.nextInt();
		System.out.println("No of 2 Column:");
		// taking 2 input for column.
		b= sc.nextInt();
		int array2[][]=new int[a][b];
		// reading the 2 matrix value.
		System.out.println("enter 2  element of array :");
		// using  for loop for row. second array.
		for (i=0;i<a;i++)
		{
	     	for ( j=0; j<b; j++)
		{
		 array2[i][j]=sc.nextInt();
		//accessing values.
		}
		System.out.println(" 2 Element Matrix Array : ");
		for (i=0;i<a;i++)
			// print second  arrays values.
		{
			for(j=0;j<b;j++)
			{
				System.out.print(array2[i][j]+ " ");
		System.out.println();
} 
		// array 3 using for addition of array1 + array2.
		int array3[][]=new int[a][b];
		// reading the matrix value.
		System.out.println("The addition  of array :");
		// using  for loop for row.to represent the addition of both array matrix.
		for (i=0;i<a;i++)
		{
	     	for ( j=0; j<b; j++)
		{
		 array3[i][j]=array[i][j]+array2[i][j];
		 System.out.println(array3[i][j]+" ");
		//accessing values.
		 }
	     	System.out.println();
	}
}
}
		}
		}
	}
}





