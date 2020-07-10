package day18_ReadingUserInput;

import java.util.Scanner;

public class Task73 {

	public static void main(String[] args) {
		
	int userInput=0;
	int secretNumber=8;
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number: ");
	  do {
		  
	  userInput=sc.nextInt();
	  
	  if(userInput<secretNumber) {
		  
		  System.out.print("Enter a larger number: ");
	  }else if(userInput>secretNumber) {
		 System.out.print("Enter a smaller number:");
	  }else {
		  System.out.print("Congrat, You got the number! ");
	  }
		  	  
	  }while(userInput!=secretNumber);

	}

}
