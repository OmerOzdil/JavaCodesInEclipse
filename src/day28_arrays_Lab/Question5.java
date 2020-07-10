package day28_arrays_Lab;

import java.util.Arrays;

public class Question5 {
	public static void main(String[] args) {

	
	int[] x = {1,2,3};
	
	int[] y = {2,4,6,9,0,10};
	System.out.println(Arrays.toString(leftrotate(x)));
	System.out.println(Arrays.toString(leftrotate(y)));

	}
	public static int[] leftrotate(int[] arr) {
		
		int z = arr[0];
		
		for( int i=0; i<arr.length-1;i++) {
			
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=z;
	
	return arr;

}
}
