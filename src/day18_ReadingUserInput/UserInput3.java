package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int i1=sc.nextInt();
		
		System.out.print("Enter a second number: ");
		int i2=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		System.out.println("Output"+ i1+ ":" + i2 + ":"+ str);
	}

}
