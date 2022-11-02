// Arithmatic Exception.
// Mane Manisha .R
//2-11-2022
package collection;
class Ex_1 {
	
	public static void main(String[] args) {
		// try block
		// code that generation exception.	
		try {
			int a=10*2 ;
			
			System.out.println(" code in try block :"+ a);
		}
	catch(ArithmeticException ae)
		
	{
		System.out.println("ArithmaticException :"+ae);
	}
		finally
		{
			System.out.println(" this is  finally :" );
		
		}
	}
}

