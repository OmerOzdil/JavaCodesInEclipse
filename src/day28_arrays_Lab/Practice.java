package day28_arrays_Lab;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		
		int [] [] numbers= {{1,2,3,76},{98,78,65,45},{45,76,2},{90,87}};
		
		System.out.println(Arrays.toString(numbers[0]));
	
		for(int[] nums: numbers) {
			  
			  System.out.println(Arrays.toString(nums));
		}
	}
	

}
