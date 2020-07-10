package day18_ReadingUserInput;

import java.util.Scanner;

public class tryAgain {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Enter a whole Number: ");
		
		
		int attempt=0;
		
		
		do {
			
			int user_amount=keyboard.nextInt();
			
			if(user_amount>1 && user_amount<=99) {
				changeMaker(user_amount);
				break;
			}else {
				attempt++;
				
				if (attempt==3){
						System.out.println("Sorry, no more attempt");
					break;
				}else {
					System.out.println("Try again");
				}
			}
				
		}while(true);
			
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


