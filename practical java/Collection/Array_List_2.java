// Create a Program  List interface with class of ArrayList(integer).
// Mane Manisha.R
//21-10-2022
package corejava;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_List_2 {
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	sc.close();
	// taking input of Numberplates
	System.out.println(" this are my three cars Numberplates :");
	// using interface List of Collection Array.
	// using class of List interface.
	ArrayList<Integer>Numberplates=new ArrayList<Integer>();
	// taking numbers to print.
	Numberplates.add(123);
	Numberplates.add(2345);
	Numberplates.add(5645);
	System.out.println(Numberplates);
}

}
