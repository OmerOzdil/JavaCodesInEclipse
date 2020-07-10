package day25_arrays_Part2;

import java.util.Scanner;

public class PassArrays {

	public static void main(String[] args) {
		
		int[] numbers= new int[4];
		
		getValues(numbers);
		System.out.println("Here are the numbers that you entered");
		
		showArray(numbers);

	}
	
	public static void getValues(int[] array) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter a series of " +array.length+ "numbers");
		
		for(int i=0; i<array.length; i++) {
			
			System.out.print("Enter number "+ (i+1)+ " :");
			array[i]=sc.nextInt();
			
		}
		
			}
	     public static void showArray(int[] array) {
		
             for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}
			
	}

}
