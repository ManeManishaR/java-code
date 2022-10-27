// WAP  program to print 4*4 matrix input take from user.
// //  Mane Manisha.R
//27-10-2022.
package corejava;
import java.util.Scanner;
public class Matrix_4by4 {
	public static void main(String[] args) {
		int i,j,x,y;
		Scanner sc =new Scanner(System.in);
		// taking no of Rows.
		System.out.println(" enter no of rows:");
		// taking input 
	   x = sc.nextInt();
		//  insert input to column. 
		System.out.println("enter no of column:");
		y= sc.nextInt();
		int array[][]= new int [x][y];
		for (i=0;i<x;i++)
		{
	     	for ( j=0; j<y; j++)
	     	{
	     		System.out.println(" enter the element :");
	     	for (i=0;i<x;i++)
			{
		     	for ( j=0; j<y; j++)
		     	{
		     	 array[i][j]=sc.nextInt();
		     	}
			// reading the matrix value.
			System.out.print("The Matrix are:");
			// using  for loop for row.to represent array matrix.
			for (i=0;i<x;i++)
			{
		     	for ( j=0; j<y; j++)
			{
			 System.out.print(array[i][j]+" ");
			//accessing values.
			 }
		     	System.out.println();
			}
	     	}	
	}
}
	}
}




	     
	