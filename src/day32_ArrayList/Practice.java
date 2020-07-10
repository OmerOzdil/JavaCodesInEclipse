package day32_ArrayList;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

    int[]  nums = new int[] {1,5,5,1,1};
    System.out.println(withFive(nums));
    
	}
	
	public static boolean withFive(int[] numbers) {
		
		for(int i=0; i<numbers.length-1; i++) {
			
			if(numbers[i]==5 && numbers[i+1]==5) {
				
				return true;
			}
		}
		return false;
		
	}

}
