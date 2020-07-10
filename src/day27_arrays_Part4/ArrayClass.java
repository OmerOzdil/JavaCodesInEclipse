package day27_arrays_Part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		//toString
		
		int[] num= {34,87,90,54};
		
		System.out.println(Arrays.toString(num));
		
		//equals
		
		int[] nums1= {2,4,5,7,91};
		int[] nums2= {2,4,5,7,90};
		System.out.println(Arrays.equals(nums1, nums2));
		
		// sort: sort array in ascending order
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		String[] languages= {"Zulu","Turkish","English", "German","Polish","Arabic"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages)); // if you have small letter put it at the back, 
		                                                 //if you have number keep it at the first.
		//binary section.
		
		int[] numX= {4,7,8,90};
		
		System.out.println(Arrays.binarySearch(numX, 90));
		System.out.println(Arrays.binarySearch(numX, 8));
		System.out.println(Arrays.binarySearch(numX, 5));
		System.out.println(Arrays.binarySearch(numX, 91));
		
		//copy()
		
		double[] d1 = {2.4,6.7,7.8};
		double[]d2 = d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[0] = 5.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double[] d3 = Arrays.copyOf(d2, d2.length);
		
		d2[0] = 5.6;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
	}

}
