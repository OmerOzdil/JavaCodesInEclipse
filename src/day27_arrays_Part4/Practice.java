package day27_arrays_Part4;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		
		
		int [][]  numbers= {{1,2,3},{45,78,99,87},{45,21,34},{76,89,89}};
		int[] x1 = {1,2,3};
		String[] lan = {"Omer Ozdil", "Ali ata bak", "Veli yazar"};
		
		System.out.println(lan[2].indexOf("e"));
		
		for(int num: x1) {
			System.out.println(num);
			
		}
		
		
		System.out.println("-----------------");
		
		
		System.out.println(Arrays.toString(x1));
		System.out.println(x1.length);
		
		for( int i=0; i<x1.length; i++) {
			System.out.println(x1[i]);
		}
		
  System.out.println("------------------------");
		
		for(int[] num1: numbers) {
			
			System.out.println(num1[1]);
		}
		
		System.out.println(Arrays.toString(numbers[0]));

	}

}
