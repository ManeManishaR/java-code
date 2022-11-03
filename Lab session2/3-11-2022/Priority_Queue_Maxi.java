/*WAP to change Priority Queue to maximum PriorityQueue.
 *  Mane Manisha.R
   3-11-2022
 * 
 */
package collection;
import java.util.*;
class Priority_Queue_Maxi {
	public static void main(String[] args) {
		PriorityQueue<Integer>obj1=new PriorityQueue<>();
		obj1.add(10);
		obj1.add(150);
		obj1.add(16);
		obj1.add(140);
		obj1.add(55);
		obj1.add(64);
		obj1.add(75);
		System.out.println("\n Orinigal Priority Queue :"+obj1);
		System.out.println("\n Maximum Priority Queue :");
		Integer a =  null ;
		while( (a = obj1.poll()) !=null ){
		System.out.print( a+" ");
	}
	System.out.println("\n");

}
}

