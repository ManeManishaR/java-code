	//WAP to demonstrate on nested if.input take from user.
	// Mane Manisha.R
	//13-10-2022
	package corejava;
	import java.util.Scanner;
	public class Input_User {
		private static int x;
		private static int y;
		private static int z;

		public static void main (String[]args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("if the percentage:");
		
			int n = sc.nextInt();
			
	//using nested loop
			// taking input 
		if (n>=90){
				System.out.println("Grade A");
			}
			else if(x>=84) {
				System.out.println("Grade B");
			}
			else if (y>=74)
			{
			     System.out.println("Grade C");
			}
			else if (z>=64)
			{
				System.out.println("Grade D");
			}
			
					
	       }
	   
	}

