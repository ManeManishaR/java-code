package corejava;

import java.util.Scanner;

class Type_Casting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press no :");
		int i=sc.nextInt();
		// explicit type casting required.
		int n = 50;
		// explicit type casting required.
		long l = n;
		// explicit type casting required.
		float f= l;
		// input taking from user.
		
		System.out.println("int value"+ n);
		System.out.println("long value"+ l);
		System.out.println("float value"+ f);
	}

}
