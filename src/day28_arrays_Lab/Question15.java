package day28_arrays_Lab;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {
		
		int[] x = {8,7,6,9,5};
		
		int a=x[0];
		
		for(int i=x.length-1; i<x.length;i++) {
			
			x[0]=x[i];
		}
		
		x[x.length-1]=a;
		System.out.println(Arrays.toString(x));
	}

}
