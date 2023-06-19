package org.tnsif.client;

//driver class
/*
* program to demonstrate on MoneyBank application
*/
import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class MoneyMoneyBankClient {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(7089, "Kirti vaity", 9000, true);
		CurrentAcc c = new MMCurrentAcc(8309, "Mohini Vaity", 15000, 900);
		
		System.out.println(s);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Saving Account");
		
		s.withdraw(200);
		
		
		System.out.println("\nCurrent Account");
		c.withdraw(400);
		

	}

}