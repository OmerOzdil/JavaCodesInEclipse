package day27_arrays_Part4;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		int[] x1 = {1,2,3};
		int[] y1 = {5,11,2};
		int[] z1 = {5,7,90,500,-4};
		System.out.println(Arrays.toString(x1));
		System.out.println(Arrays.toString(changed(x1)));
		System.out.println(Arrays.toString(changed(y1)));
		System.out.println(Arrays.toString(changed(z1)));

	}
	public static int[] changed(int[] x) {
		int max=x[0];
		for(int i=0; i<x.length; i++) {
			if(x[i]>max) {
				max=x[i];
			}
			
		}
		for(int i=0; i<x.length; i++) {
			x[i]=max;
		}
		return x;
		
	}
}
