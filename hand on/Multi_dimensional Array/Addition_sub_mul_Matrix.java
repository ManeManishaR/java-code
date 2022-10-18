// WAP to Multi dimensional Array Addition,Subtraction, Multiplication, Division of no .
//Mane Manisha.R
//18-10-2022.
package corejava;
import java.util.Scanner;
 class Addition_sub_mul_Matrix {
	private static String[][] array3;
	public static void main (String[]args) {
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
				System.out.println();
				// 2 array.
				//  adding second  array .
				System.out.println("No of 2 Rows :");
				// taking 2 input for row .
				  a =sc.nextInt();
				System.out.println("No of 2 Column:");
				// taking 2 input for column.
				b= sc.nextInt();
				int array2[][]=new int[a][b];
				// reading the 2 matrix value.
				System.out.println("enter 2 element of array :");
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
					}
				System.out.println();
		} 
				// array 3 using for addition of array1 + array2.
				int array3[][]=new int[a][b];
				// reading the matrix value.
				System.out.print("The addition  of array :");
				// using  for loop for row.to represent the addition of both array matrix.
				for (i=0;i<a;i++)
				{
			     	for ( j=0; j<b; j++)
				{
				 array3[i][j]=array[i][j]+array2[i][j];
				 System.out.print(array3[i][j]+" ");
				//accessing values.
				 }
			     	System.out.println();
				}
			     //  using array 4 for subtraction of array.	
			     	int array4[][]=new int[a][b];
					// reading the matrix value.
					System.out.print("The subtraction  of array :");
					// using  for loop for row.to represent the subtraction  of both array matrix.
					for (i=0;i<a;i++)
					{
				     	for ( j=0; j<b; j++)
					{
					 array3[i][j]=array[i][j]-array2[i][j];
					
					 System.out.print(array3[i][j]+" ");
			}
				     	System.out.println();
		}
					// using array 5 for multiplication of array.
					int array5[][]=new int[a][b];
					// reading the matrix value.
					System.out.println("The multiplication  of array :");
					// using  for loop for row.to represent the multiplication of both array matrix.
					for (i=0;i<a;i++)
					{
				     	for ( j=0; j<b; j++)
					{
					 array3[i][j]=array[i][j]*array2[i][j];
					
					 System.out.print(array3[i][j]+" ");
			}
				     	System.out.println();
		}
				}
				// using array 6 for division of array.
				int array6 [][]=new int[a][b];
				// reading the matrix value.
				System.out.print("division  of array :");
				// using  for loop for row.to represent the division of both array matrix.
				for (i=0;i<a;i++)
				{
			     	for ( j=0; j<b; j++)
				{
			     array2[i][j]= array[i][j]/array2[i][j];
						 System.out.print(array2[i][j]+" ");
		}
			     	System.out.println();
				}
	}
}
}
}








	