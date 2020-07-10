package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a byte value:");
		
		String b1=sc.nextLine();
		System.out.println("Byte is: "+ b1 );
		System.out.print("Enter a short Value:");
		
		short s=sc.nextShort();
		
		System.out.println("Short value is:"+ s);
		
		System.out.print("Enter a integer value:");
		
		int i1=sc.nextInt();
		System.out.println("Your integer value is:"+ i1);
		
		System.out.println("Enter a boolean value:");
		
		boolean bool=sc.nextBoolean();
		
		System.out.print("Your boolean value is:"+ bool);
			
			

	}

}
