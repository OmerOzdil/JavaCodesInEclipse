package day25_arrays_Part2;

public class SameArray {

	public static void main(String[] args) {


		int[] array1= {2,4,8,90,100};
		
		int[] array2=array1;
		
		array1[3]=200;
		array2[2]=1000;
		
		
		System.out.println("The contents of array1");
		for(int value: array1) {
			
			System.out.println(value);
		}
		
		System.out.println("The contents of array2");
            for(int value: array2) {
			
			System.out.println(value);
	}}
	
	

}
