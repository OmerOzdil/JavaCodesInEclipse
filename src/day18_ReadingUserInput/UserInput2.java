package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {


		Scanner s1= new Scanner(System.in);
		
		System.out.println("Provide a sentence I will repeat it:");
		
		//String str=s1.next();
		//System.out.println(str);
		
		System.out.println("Provide another sentence I will repeat it:");
		
		String str2=s1.nextLine();
		System.out.println(str2);
		
	

	}

}
