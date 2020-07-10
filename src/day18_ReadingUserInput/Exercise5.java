package day18_ReadingUserInput;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the meal charge: ");
		
		double meal=sc.nextDouble();
		
		double tax= meal*0.0675;
		
		 double tip= (tax+meal)*0.2;
		 
		 System.out.println("The price for the meal is $" + meal+".");
		 System.out.println("The amount for the tax is $"+ tax+".");
		 System.out.println("The amount given for the tip is $"+ tip+".");
		 System.out.println("Th amount for the total bill is $"+ (meal+tip+tax)+".");

	}

}
