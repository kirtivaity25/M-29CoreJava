//program to demonstrate an Arithmetic operator 
package org.tnsif.operatordemo;
import java.util.Scanner;
public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Tha addition of two numbers:" +(x+y));
		System.out.println("Tha of subtraction two numbers:" +(x-y));
		System.out.println("Tha multification of two numbers:" +(x*y));
		System.out.println("Tha division of two numbers:" +(x%y));
        
		sc.close();
	}

}
