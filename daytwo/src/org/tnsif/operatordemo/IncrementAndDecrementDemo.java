package org.tnsif.operatordemo;
public class IncrementAndDecrementDemo {

	public static void main(String[] args) {
		int a=12 , b=5;
		int x= a++; //12
		++a; //++13//14
		--b;//4
		int y= b--;//4--
		System.out.println(a);
		System.out.println(x);
		System.out.println(b);//3
		System.out.println(y);//4
	}
}
