package day18_ReadingUserInput;

import java.util.Scanner;

public class Lab3SumofNumbers {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a positive nonzero integer number: ");
		
		
		do {
			
			int num=Keyboard.nextInt();
			
			if(num>1) {
				sum=sum+num;
			System.out.print("Do you still wnt to enter a number: ");
			
			}else {
				break;		
			}
			
					
		}while(true);
		
		
			System.out.print("Sum of numbers you entered is: "+ sum );
	}

}
