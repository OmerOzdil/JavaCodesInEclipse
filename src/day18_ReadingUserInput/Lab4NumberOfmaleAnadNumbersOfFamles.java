package day18_ReadingUserInput;

import java.util.Scanner;

public class Lab4NumberOfmaleAnadNumbersOfFamles {

	public static void main(String[] args) {
		
		Scanner User_Input = new Scanner(System.in);
		
		System.out.print("Please enter the number of males: ");
		double numberOfMales= User_Input.nextInt();
		
		per(numberOfMales);
		
		System.out.print("Please enter the number of females: ");
		double numberOfFemales=User_Input.nextInt();
		
	    per(numberOfFemales);
	    
	    
		double TotalNumbers= numberOfMales+numberOfFemales;
		double perMales=per(numberOfMales)/TotalNumbers;
		double perFemales=per(numberOfFemales)/TotalNumbers;
		
		
		
		System.out.println("Percentages of the males is: %"+ perMales);
		System.out.println("Percentages of the femmales is: %"+ perFemales);
		
			

	} public static double per(double amount) {
		
		double per =amount*100;
		return per;
		
	}

}
