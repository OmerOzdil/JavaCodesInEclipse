package day27_arrays_Part4;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		int[] x1 = {1,2,3};
		int[] y2 = {5,11,2};
		
		System.out.println(Arrays.toString(rotated(x1)));

	} 
	public static int[] rotated(int[] x) {
		int counter=0;
		for(int i=0; i<x.length; i++) {
			
			x[i]=x[x.length-1-(counter)];
			
			counter--;
		
			}
	return x;
	}

}
