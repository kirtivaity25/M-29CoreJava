package org.tnsif.stringprograms;

public class StrinOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("John ");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.hashCode());
		System.out.println(str1.concat("Charles"));
		System.out.println(str1 + "Charles");
	}

}
