package org.tnsif.stringprograms;

import java.util.Scanner;

public class StringMethodProgram {

	public static void main(String[] args) {
		String str1 = "Dhoni";
		Scanner sc = new Scanner(System.in);
		String str2 = new String(sc.nextLine());

		if (str1.equals(str2))
			System.out.println("Both are equal");

		else
			System.out.println("Not equal");

	}
}