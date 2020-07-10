package day25_arrays_Part2;

import java.util.Arrays;
import java.util.Random;

public class Task91 {

	public static void main(String[] args) {
		
		int number=0;
		Random rn= new Random();
		int[] array= new int[10];
		
		for(int i=0; i<array.length;i++) {
			number=rn.nextInt((100-0)+1)+0;
			array[i]=number;
			System.out.println(array[i]);
					
			
		}
		System.out.println(Arrays.toString(array));
		
		}
		

	}


