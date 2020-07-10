package day25_arrays_Part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
	
		
		
		double PayRate;
		
		
		Scanner sc=new Scanner(System.in);
		
		int[] hours= new int[5];
		
		System.out.println("Please enter the hours:");
		for(int i=0; i<hours.length; i++) {
			hours[i]=sc.nextInt();
		}
		System.out.print("Please enter the payrate:");
		
		PayRate=sc.nextInt();
		
		for(int i=0; i<hours.length; i++) {
			 double GrossPay=hours[i]*PayRate;
		
		System.out.println("Employee "+ (i+1)+ ": $"+ GrossPay);
		
		}

	}

}
