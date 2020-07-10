package day28_arrays_Lab;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,87};
		int[] y = {11,5,9};

		
		System.out.println(Arrays.toString(changed(x)));
		System.out.println(Arrays.toString(changed(y)));
	}
	public static int[] changed(int[] x) {
		
             int max=x[0];		
		for(int i=0; i<x.length; i++) {
			if(x[i]>max) {
				
				max=x[i];	
				}
			}
		for(int j=0; j<x.length; j++){
			
			x[j]=max;
		}
		return x;
		
	}

}
