package day35_Encapsulation;

import java.util.Random;
import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your number from 0-36: ");
		int number = sc.nextInt();
		
		RoulettePocket num1 = new RoulettePocket(number);
		
		while(num1.getPocketColor().equalsIgnoreCase("not eligible")) {
			System.out.print("Please enter your number from 0-36: ");
			num1.setNumber(sc.nextInt());
		}
		System.out.println(num1.getPocketColor());
		
	
		

	}

}
