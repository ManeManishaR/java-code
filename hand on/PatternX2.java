 /*
 11 22 33 44 55
 21 22 23 24 25
 31 32 33 34 35 
 41 42 43 44 45
 51 52 53 54 55
 
*             *
    *      *
       *
   *        *
*              *



 
  class PatternX1
  {
      public Static void main(String[] args)

      {
         for ( int i = 1;i<=5; i++)
           {
              for( int j = 1;j<=5; j++)
                   {
		      System.out.print("*");
                         if(i%2==0)
			 break;
				}
			System.out.println();
			
			}
	}
}

/*

1    *         *
2       *   *     
3         * ( STOP )
4      *     *
5  *            *
*/