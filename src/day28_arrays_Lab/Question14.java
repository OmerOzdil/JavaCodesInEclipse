package day28_arrays_Lab;

import java.util.Arrays;

public class Question14 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,7};
		int[] y = {6,4,8,9,8,9};
		
		System.out.println(Arrays.toString(NewArray(x, y)));
	}
	public static int[] NewArray(int[] x, int[] y) {
		
		int [] arr= new int[x.length+y.length];
		
		 
		for(int i=0; i<x.length; i++) {
			
			arr[i]=x[i];
		}
		int a=0;
		for(int j=x.length; j<arr.length; j++) {
			
			arr[j]=y[a];
			a++;
			
			
		}
			
		
		return arr;
		
	}

}
