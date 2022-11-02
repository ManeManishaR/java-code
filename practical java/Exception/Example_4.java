// Null Pointer Exception
// Mane Manisha .R
//2-11-2022.
package Exception;
 class Example_4 {
	public static void main(String[] args) 
	{
		try
		{
			String s= null;
			// null value 
			System.out.println(s.charAt(0));
		}
			catch(NullPointerException e)
			{
				System.out.println("NullPointerException=>"+e.getMessage());
			}
			}		
}
