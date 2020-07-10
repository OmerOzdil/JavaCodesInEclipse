package day33_ClassessObject_Constructors;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 
		
		System.out.print("What is your starting balance: ");
	
		String input=sc.next();
		
		BankAccount account= new BankAccount(input);
		System.out.print("How much were u you paid this month: ");
		String amount=sc.next();
		
		account.deposit(amount);
		System.out.println("Your pay has been deposited. Your current balance is: "+ account.getBalance());

	}

}
