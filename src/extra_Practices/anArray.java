package extra_Practices;

import java.util.Arrays;
import java.util.Random;

public class anArray {

	public static void main(String[] args) {

		Random rn = new Random();
		
		int [] arr = new int [10];
		
		for(int i=0; i<arr.length; i++) {
			
			int number=rn.nextInt(100);
			arr[i]=number;		
		}	


		for(int num1 : arr) {
			System.out.println(num1);
		}

	}

}
