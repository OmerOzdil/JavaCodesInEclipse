package day18_ReadingUserInput;

import java.util.Scanner;

public class Lab2Calories {

	public static void main(String[] args) {
		
		Scanner User_Input = new Scanner(System.in);
		
		System.out.print("Please enter the number of cookies you ate: ");
		
		int num=User_Input.nextInt();
		
		calories(num);
		System.out.println("Totla calories you consumed is: "+ calories(num));
		
	}
	
	public static int calories(int NumberOfCookies) {
		
		int sum=NumberOfCookies*75;
		
		return sum;
		
		
	}
	

}
