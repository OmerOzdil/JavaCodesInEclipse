package day18_ReadingUserInput;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter thenumber of males in the class: ");
		
		double males=sc.nextInt();
		System.out.print("Please enter the number of fameles in the class: ");
		double females=sc.nextInt();
		
		double tot=males+females;
		
		System.out.println("Percentage of the males in the class is %"+(males/tot)*100);
		System.out.println("Percetange of the females in the class is %"+(females/tot)*100);
	}
		
	

}
