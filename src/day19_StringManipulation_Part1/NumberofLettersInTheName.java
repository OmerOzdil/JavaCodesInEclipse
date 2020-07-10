package day19_StringManipulation_Part1;

import java.util.Scanner;

public class NumberofLettersInTheName {

	public static void main(String[] args) {
		
		Scanner User_Input= new Scanner(System.in);

			System.out.print("Please enter your name: ");
			
			String name = User_Input.nextLine();
			
			System.out.print("Enter your last name: ");
			
			String lastname= User_Input.nextLine();
			
			System.out.println("Number of Letters: "+ (name.length()+lastname.length()));
			
	}		

}
