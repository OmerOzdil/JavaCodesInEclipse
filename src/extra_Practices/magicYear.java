package extra_Practices;

import java.util.Scanner;

public class magicYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a month ");
		int month=sc.nextInt();
		System.out.print("Please enter a day ");
		int day=sc.nextInt();
		System.out.print("Please enter a year");
		int year=sc.nextInt();
		
		if(day*month==year) {
			System.out.println("It is a magic year. "+ day+ " * "+ month+ " is equal to "+ year);
		}else {
			System.out.println("It is not a magic year."+ day+ " * "+ month+ " is not equal to "+ year);
		}

	}

}
