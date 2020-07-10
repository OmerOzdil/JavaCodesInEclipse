package day30_wrapperClass;

import java.util.Arrays;

public class varArgm {

	public static void main(String[] args) {
		
		String[] x= {"Omer","Ozdil"};
		String y= "Oooo";
		
		System.out.println(Arrays.toString(x));
		
		sum(2,4);
		sum(45,68,90,65);
			

	}
	public static void sum(int... numbers) {
		
		
		int sum=0;
	for(int values: numbers) {
		
		sum=sum+values;
	}
	System.out.println(sum);
	}


}
