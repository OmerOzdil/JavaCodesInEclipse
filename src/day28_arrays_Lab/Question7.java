package day28_arrays_Lab;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,6,9};
		int[] arr1={};
		
		System.out.println(Arrays.toString(firstAndLast(arr, arr1)));

	}
	
	public static int[] firstAndLast(int[] x,int[] y){
		 y = new int[2];
		y[0]=x[0];
		y[1]=x[x.length-1];
		return y;
		
	}

}
