package day32_ArrayList;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
		
		
		int size= 3;
		int[] arr = new int[] {3,4,5,8};
		
	    arr[3]=56;
	    
		System.out.println(Arrays.toString(doubleit(arr)));
		
		for(int arr1: doubleit(arr)) {	
			System.out.println(arr1);
		}
		
	}
	
	public static int[] doubleit(int[] arr) {
		
		int[] newArray= new int[2*arr.length];
		newArray[newArray.length-1]=arr[arr.length-1];		
		return newArray;
	}
	

}
