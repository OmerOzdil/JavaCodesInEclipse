package day28_arrays_Lab;

public class Question20 {

	public static void main(String[] args) {
		
		int[] arr  = {1,2,2};
		int[] arr1 = {1,2,1,2};
		int[] arr2 = {2,1,2};
		int[] arr3 = {2,2,1,1};
		System.out.println(two(arr));
		System.out.println(two(arr1));
		System.out.println(two(arr2));
		System.out.println(two(arr3));
		
		

	}
	public static boolean two(int[] x) {
		
		for(int i=0; i<x.length-1;i++) {
			
			if(x[i]==2 & x[i+1]==2) {
				
				return true;		
			}
		}
		return false;
	}

}
