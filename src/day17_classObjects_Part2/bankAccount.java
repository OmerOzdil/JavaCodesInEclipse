package day17_classObjects_Part2;

public class bankAccount {

	
	double Balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit( double amount) {
		System.out.println("depositing $"+ amount + " to "+ accountNumber);
		
		Balance+=amount;
		
	}
	public void withdraw(double amount) {
		
		System.out.println("------------------");
		System.out.println("Withdrawing $"+ amount+ " from "+ accountNumber);
		Balance-=amount;
		if(Balance<0) {
			Balance-=35;
		}
	}
	public void showBalance() {
		System.out.println("---------------");
		System.out.println("AccountHoler:"+ accountHolder);
		System.out.println("AccountNumber:"+ accountNumber);
		System.out.println("balance $"+ Balance);
	}
	
	public void charge(double price, String item) {
		
		System.out.println("---------------------");
		if(Balance>=price) {
			System.out.println("buying"+ item + "  for $"+ price+ " from "+ accountNumber);
		}else {
			System.out.println("Insufficent  funds to purchase"+ item +" from"+ accountNumber );
		}
		
	}
	
}

