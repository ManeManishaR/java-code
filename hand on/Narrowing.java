package corejava;

import java.util.Scanner;

public class Narrowing {

	public static void main(String[] args) {
		
		// explicit type casting required.
		double d =100.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("press no :");
		int x = sc.nextInt();
		sc.close();
		// explicit type casting required.
		long l = (long)d;
		// explicit type casting required.
		int i= (int)l;
		// input taking from user.
		
		System.out.println("double value :"+ d);
		System.out.println("long value:"+ l);
		System.out.println("int value"+ i);
	}

}
