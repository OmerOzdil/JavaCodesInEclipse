package day18_ReadingUserInput;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Please enter the price of the purchase: $");
		
		double price=sc.nextDouble();
		
		double sttax=price*0.04;
		double cntax=price*0.02;
		
		System.out.println("The amount you paid for the purchase: $"+ price);
		System.out.println("The state tax is $"+sttax);
		System.out.println("Th county tax is $"+cntax);
		System.out.println("The total is $"+ (price+sttax+cntax));
		

	}

}
