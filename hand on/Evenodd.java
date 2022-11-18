class EvenOdd
{
	public static void main( String[] args)
	{

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter a no: ");

		int a = sc.nextInt();

		if( a % 4 == 0)
		{
		System.out.println("Even");
		}

		else
		{
		System.out.println("Odd");
		}

	}
}