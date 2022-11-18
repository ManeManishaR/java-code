
starter --uer input -value ( self service)
 	main=course--user input -value(%4)
		desert -- user input -value (%4)
	 
*/
import java.util.*;
class Restorant
 	
{
	Static double calculateTotalAmount();
	 
		{
	Scanner sc = Scanner (System.in);
   			
   system.out.printIn("Enter the price of starter :");
           int st =  sc.nextInt();

 system.out.printIn("Enter the price of main course :");
           int maincrs = sc.nextInt();

 system.out.printIn("Enter the price of desert :");
           int dsrt =   sc.nextInt();
  
double stax = 0.04;
double tax_amt = (stax*(maincrs + dsrt));

 
system.out.printIn("Total Tax Amount :" + tax_amt);

double total_payable = st +maincrs +dsrt + tax_amt;

return total payable;
}
	public Static void main (String[]arg)
		{
 System.out.printIn("Total Amount to be paid :"+ calculateTotalAmount())


    }
           }

