package day28_arrays_Lab;

import java.util.Arrays;

public class Question11 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int[] arr1 = {2,3,5};
		int[] arr2 = {1,2,1};
		int[] arr3 = {11,2,13,3,2};
		System.out.println(Arrays.toString(TwoThree(arr)));
		System.out.println(Arrays.toString(TwoThree(arr1)));
		System.out.println(Arrays.toString(TwoThree(arr2)));
		System.out.println(Arrays.toString(TwoThree(arr3)));

	}
	public static int[] TwoThree(int[] x) {
		
		for(int i=0; i<x.length-1; i++) {
			
			if(x[i]==2 && x[i+1]==3) {
				x[i+1]=0;
			}
		}
			
	return x;	
	}

}
