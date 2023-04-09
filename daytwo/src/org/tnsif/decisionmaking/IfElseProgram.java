//Program to demonstrate on If--else condition
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class IfElseProgram {
     //if we have two condition then decide then we will use id-else
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age and weight of a" +"doner");
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age >18 && weight > 50 )
		{
			System.out.println("Eligible to donate the blood");
			
		}
		else
		{
			
			System.out.println("Not Eligible to donate the blood"+"blood");
		}		
		
	}

}
