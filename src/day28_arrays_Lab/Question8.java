package day28_arrays_Lab;

public class Question8 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6};
		int[] arr1 = {7,8,9,78};
		
System.out.println(twoOrThree(arr));
System.out.println(twoOrThree(arr1));
	}
	public static boolean twoOrThree(int[] x) {
		
		for(int i=0; i<x.length;i++) {
			if(x[i]==2 || x[i]==3) {
				return true;
			}
		}
	return false;
	}

}
