package day18_ReadingUserInput;

import java.util.Scanner;

public class changeMakerMethod {

	public static void main(String[] args) {
		
		
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Enter a whole Number: ");
		int user_amount=keyboard.nextInt();
		
		if(user_amount>1 && user_amount<=99) {
			changeMaker(user_amount);
		}else {
			System.out.println("Not a valid");
		}
	}	
	
	public static void changeMaker(int amount){
		
		
	
	int originalAmount=amount;
	
	int quarter=amount/25;
	amount=amount%25;
	int dimes=amount/10;
	amount=amount%10;
	int nickles=amount/5;
	amount=amount%5;
	int pennies=amount;
	
	
	
	System.out.println(originalAmount+ "cents in coins can be given as");
	System.out.println(" ");
	
	System.out.println(quarter+ "quarter");
	System.out.println(dimes+" dimes");
	System.out.println(nickles+" nickles");
	System.out.println(pennies+ " pennies");
	
		
	}
	
	
	

}
