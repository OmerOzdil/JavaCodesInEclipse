package day28_arrays_Lab;

import java.util.Arrays;

public class Question13 {

	public static void main(String[] args) {
	
		
		int[] x = {1,2};
		int[] y = {3,4};
		
		int[] a = {6,8};
		int[] b = {9,5};
		
		NewArray(x,y);
		NewArray(a,b);
		
		
		
	

	}
	public static void NewArray(int[] x, int[] y) {
		
		int[] arr = new int [2];
		
		int totalx=0;
		int totaly=0;
		
		for(int i=0; i<x.length; i++) {
			
			totalx=totalx+x[i];
		}
		for(int j=0; j<y.length; j++) {
			
			totaly=totaly+y[j];
		}
		
		if(totaly>totalx) {
			arr[0]=y[0];
			arr[1]=y[1];
			
            System.out.println(Arrays.toString(arr));
            
		}else if(totalx>totaly) {
			arr[0]=x[0];
			arr[1]=y[1];
			
			System.out.println(Arrays.toString(arr));	
			
		}else {
			System.out.println("Equal");
			
		}
		
		
		
		
	}

}
