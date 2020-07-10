package day28_arrays_Lab;

public class Question12 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr1 = {1,3};
		
		int[] arr2 = {7,2,3};
		int[] arr3 = {1};
		int[] arr4 = {8,2,3};
		int[] arr5 = {9};
		
		
		System.out.println("Output="+number1(arr, arr1));
		System.out.println("Output="+number1(arr2, arr3));
		System.out.println("Output="+number1(arr4, arr5));
	}
	
	public static int number1(int[]x, int[]y ) {
	int counterx=0;
	int countery=0;
	int output=0;
	
		if(x[0]==1) {
			counterx++;
		}
		
		if(y[0]==1) {
			countery++;		
		}
		output=counterx+countery;
		return output;
	 }

}
