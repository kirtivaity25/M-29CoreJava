//program to demonstrate on user-input
package org.tnsif.userinput;
import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		//user-input
	
		Scanner s=new Scanner (System.in);
		System.out.println("Enter Your salary:");
		float salary=s.nextFloat();
		//double salary1=s.nextDouble();
		String name=s.nextLine();
		System.out.println("Enter the character: ");
		char ch=s.next().charAt(0,7);
	
		System.out.println("Enter Your Name");
		System.out.println("salary is : "+salary);
		System.out.println("salary is : "+name);
		s.close();
		

	}

}
