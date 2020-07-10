package day28_arrays_Lab;

import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {
	
		
		int[] arr = {1,2,3};
		int[] arr1 = {32,67,43,89,90,123};
		System.out.println(Arrays.toString(doubleit(arr)));
		System.out.println(Arrays.toString(doubleit(arr1)));
		
	}

	public static int[] doubleit(int[] x) {
   int [] Newarray= new int[x.length*2];
		
   Newarray[Newarray.length-1]=x[x.length-1];
   
   return Newarray;
	}
}
