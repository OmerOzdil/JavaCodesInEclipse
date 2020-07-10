package day27_arrays_Part4;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		
		
		int[] x1 = {1,2,3};
		int[] y1 = {};
		
		System.out.println(Arrays.toString(add(x1, y1)));

	}
	public static int[] add(int[] x, int[] y) {
		
		for(int i=0; i<x.length; i++) {
			
			if(i==0 || i==x.length-1) {
				
				y[i]= x[i];
				
			}
		}
		return y;
		
		
		
	}

}
