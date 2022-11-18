class PrimeNumber
{
public static void main(String[]args)

{
int i =1, n= 20;

if (isPrime (i));
System.out.println();
}
static boolean isPrime (int n)
{
int count = 0;
if (n < 2)
return false;
// cheaking the number of divisors b/w 1 and the number n-1
for (int i =2; i<= n; i++)
{
   if(n%i==0)
return false;
}
   return true;
     }

}


