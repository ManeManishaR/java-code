class OverLoding1
 {
   static void Address(int n) 
    {
    System.out.println(n);
    }
    static void Address(int n, String p)
    {
    System.out.println( "pin:" + n + "police station: "+ p);
    }
   static void Address(int n, String p,String s)
    {
     System.out.println( "pin:" +n+"police station:  "+  p +"assembly:"+s);
    }
  
  public static void main(String args[])
  {
  int n= 431001;
  String p ="Aurangabad";
  String s = "Maharashtra";
  Address(n);
  Address(n,p);
  Address(n,p,s);
   }
  }