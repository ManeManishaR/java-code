   class Overloading 

    { 	
    static void m1(int a) 
    {
    System.out.println( "pin:" +a);
    }
    static void m1(int a, String ps)
    {
    System.out.println( "pin:" +a+"police station:  "+  ps);
    }
   static void m1(int a, String ps,String ps)
    {
     System.out.println( "pin:" +a+"police station:  "+  ps +"assembly:"+as);
    }
  
    public static void main(String args[])
    {
    display m1(431001);
    display m1(431001,"Aurangabad");
    display m1(431001,"Aurangabad","assembly");


               }
          }
  