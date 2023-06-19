package org.tnsif.synchronization;
//program to demonstrate on synchronization

//calculating the power
public class Power {
	synchronized void printPower(int num) {
		int x = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+ num + "^" + i + "value: " + num * x);

			x = num * x;

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}