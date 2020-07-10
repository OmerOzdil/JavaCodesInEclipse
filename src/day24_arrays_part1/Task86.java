package day24_arrays_part1;

import java.util.Scanner;

public class Task86 {

	public static void main(String[] args) {
		
		Scanner EnterANumber= new Scanner(System.in);
		String[] myArrays= new String[12];
		myArrays[0]="Jan";
	    myArrays[1]="Feb";
	    myArrays[2]="Marc";
	    myArrays[3]="Apr";
	    myArrays[4]="May";
	    myArrays[5]="Jun";
	    myArrays[6]="July";
	    myArrays[7]="Aug";
	   	myArrays[8]="Sep";
	   	myArrays[9]="Oct";
	   	myArrays[10]="Nov";
	   	myArrays[11]="Dec";
	   	
	    							
		
		System.out.print("Enter a number: ");
		
		int index=EnterANumber.nextInt();
		
		System.out.println("The month is: "+ myArrays[index]);
		

	}

}
