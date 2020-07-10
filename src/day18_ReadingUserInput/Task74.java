package day18_ReadingUserInput;

import java.util.Scanner;

public class Task74 {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner sumNumber=new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		
		do {
			
			int num1=sumNumber.nextInt();
			
			if(num1>0) {
				sum=sum+num1;
				
				System.out.print("Enter another number: ");
			}else {
				System.out.println("Number is not valid");
				System.out.println("Sum of Numbers: "+ sum);
				break;
			}
			
		}while(true);

	}

}
