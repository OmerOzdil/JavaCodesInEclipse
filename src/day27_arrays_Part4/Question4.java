package day27_arrays_Part4;

public class Question4 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {5,11,2};
		int[] z = {7,0,0};
		int[] a = {3,-2,10,4};
		
		
		System.out.println(sum(x));
		System.out.println(sum(y));
		System.out.println(sum(z));
		System.out.println(sum(a));
	}
	public static int sum(int[] x) {
		int sum=0;
		for(int i=0; i<x.length; i++) {
			sum= sum + x[i];	
		}
		return sum;
	}

}
