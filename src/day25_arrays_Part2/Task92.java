package day25_arrays_Part2;

import java.util.Arrays;
import java.util.Random;

public class Task92 {

	public static void main(String[] args) {
		
		int value=1;
		
	int[] numbers= new int[10];
	
	   for(int i=0; i<numbers.length;i++) {
		   
		   numbers[i]=value;
		   value++;	  
		   System.out.println(numbers[i]*19);
		   
	   }
	   
	   System.out.println("*******************");
	
	for(int i=0; i<numbers.length; i++) {
		System.out.println(numbers[i]*19);	
	}
	
	System.out.println(Arrays.toString(numbers));

	}

}
