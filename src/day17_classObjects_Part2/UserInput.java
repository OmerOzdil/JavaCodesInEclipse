package day17_classObjects_Part2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		 
		Scanner sc= new Scanner(System.in);
		Scanner sc1 = new Scanner( System.in);
		
		System.out.print("Enter a byte value:");
		
		String b1=sc.nextLine();
		
		System.out.println(b1);
		System.out.println(b1+"is my name");
		System.out.println(b1);
		
		
		System.out.println("Plase Enter your name: ");
		
		String b2=sc1.nextLine();
		
		
		
		System.out.println("here is your Name: "+ b2);
		
		
		
		

	}

}
