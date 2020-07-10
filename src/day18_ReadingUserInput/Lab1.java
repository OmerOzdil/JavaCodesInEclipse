package day18_ReadingUserInput;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int LargestNumber=1;
		int SmallestNumber=0;
		
		
		
		System.out.print("Enter a number: ");
		
		do {
		 int num=sc.nextInt();
		 System.out.print("Do you want to enter: 0-No, 1-Yes " );
		 
		 int YesorNo=sc.nextInt();
		 if(YesorNo==1) {
			 System.out.print("Enter your next number:");
			 if(num>LargestNumber) {
				LargestNumber=num;
				
			}if(SmallestNumber>num)
				SmallestNumber=num;
			 	 	 
		 }else {
			 
			 break;
		 }
			
			
		}while(true);
		
System.out.println("Largest number is: "+ LargestNumber);
System.out.println("Smallest number is: "+ SmallestNumber);
	}

}
