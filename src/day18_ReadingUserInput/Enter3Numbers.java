package day18_ReadingUserInput;

import java.util.Scanner;

import day13_methods_Part1.sum;

public class Enter3Numbers {

	public static void main(String[] args) {

    Scanner sumNumber= new Scanner(System.in);
    
    
    System.out.print("Please enter a number: ");
      int num1=sumNumber.nextInt();
        
    System.out.print("Please enter seconf number: ");
     int num2=sumNumber.nextInt();
     
    System.out.print("Pease enter third number: ");
      int num3=sumNumber.nextInt();
      
    System.out.println("Sum of th 3 number is: " + (num1+num2+num3));
      
      
     
    
    
    	
    	
    

	}

}
