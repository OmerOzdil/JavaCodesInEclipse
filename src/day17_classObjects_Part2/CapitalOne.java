package day17_classObjects_Part2;

public class CapitalOne {

	public static void main(String[] args) {
		 bankAccount acc1 = new bankAccount();
		 acc1.accountHolder="Omer";
		 acc1.accountNumber=12345;
		 
		 acc1.deposit(250);
		  
		 acc1.showBalance();
		 
		 acc1.withdraw(100);
		 
		 acc1.showBalance();
		 
		 acc1.charge(50, "pen");
		 
		 acc1.showBalance();
		 
	}

}
