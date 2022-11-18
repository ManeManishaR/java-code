//WAP to demonstrate  on nested for loop and print star pattern.
// Mane Manisha.R
//13-10-2022
package corejava;
public class Pattern_Star {

	public static void main(String[] args) {
		// using for loop.
		for( int i = 1;i<=6; i++)
		{
			for( int j = 1;j<=i; j++)
				// Print star with 6 line.
			{					
				System.out.print("*");			
			}
		System.out.println();
	}
	}
}
