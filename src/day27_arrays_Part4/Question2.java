package day27_arrays_Part4;

public class Question2 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		System.out.println(Equals(x));
		System.out.println(Equals(y));
		System.out.println(Equals(z));
		System.out.println(Equals(k));

	}
	
	public static String Equals(int[] arr) {
		
		
		
		if( arr.length>1) {
			if(arr[0]==arr[arr.length-1]) {
				return "True";
				
			}else {
				return "False";	
			}
		}
		return "In valid";
	}

}
