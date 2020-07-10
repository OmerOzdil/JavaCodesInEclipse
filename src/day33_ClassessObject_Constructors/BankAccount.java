package day33_ClassessObject_Constructors;

public class BankAccount {

	
	double balance;
	
	//This constructor sets the starting balance at 0.0;
	public BankAccount() {
		balance= 0.0;
	}
	public BankAccount(double startBalance) {
		balance=startBalance;
	}
	
	//This constructor sets the starting balance to the value in the string argument.
	
	public BankAccount(String str) {
		
		balance= Double.parseDouble(str);
	}
	
	//Deposit method makes a deposit into account
	
	public void deposit(double amount) {
		balance= balance+ amount;
	}
	
	//Deposit method makes a deposit into account
	
	public void deposit(String str) {
		
		balance= balance+ Double.parseDouble(str);
		
	}
	public double getBalance() {
		return balance;
		
		
	}
}
