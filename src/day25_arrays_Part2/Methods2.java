package day25_arrays_Part2;

public class Methods2 {

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40};
		
		addByOne(numbers);
		
		for(int values: addByOne(numbers)) {
			System.out.print(values+ " ");
		}

	}
	
	public static int[] addByOne(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			
			array[i]=array[i]-1;	
		}
		return array;	
	}

}
