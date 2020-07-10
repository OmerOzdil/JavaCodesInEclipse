package day30_wrapperClass;

import java.util.Arrays;

public class Task96 {

	public static void main(String[] args) {
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day  to practice java.";
		
		String[] arr=str1.split(" and ");
		System.out.println(Arrays.toString(arr));
		
		String[] arr1=arr[1].split(" degree");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("----------------------");
		
		String degree = arr1[0];
		System.out.println(degree);
		System.out.println("----------------------");
		
		
		double degreeF = Double.parseDouble(degree);
		
		double degreeC = (degreeF-32)*5/9;
		
		System.out.println(degreeF + "degree is equal to "+ Math.round(degreeC)+ " Celcius");
		
		
		
		

	}

}
