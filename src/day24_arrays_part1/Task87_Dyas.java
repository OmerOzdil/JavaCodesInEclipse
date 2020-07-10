package day24_arrays_part1;

import java.util.Scanner;

public class Task87_Dyas {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		String[] days = new String[7];
		
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Firday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		
		System.out.print("Please Enter a Number: ");
		
		int number=sc.nextInt();
		
		System.out.print("Today is "+ days[number]);
		
		
		

	}

}
