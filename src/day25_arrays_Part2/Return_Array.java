package day25_arrays_Part2;

public class Return_Array {

	public static void main(String[] args) {
		
		double[] values;
		
		values=getArray();
		System.out.println(values[3]);
		
		for( double num: values) {
			
			System.out.print(num+ " ");
		}
		
		
	}
	public static double[] getArray() {
		
		double[] array= {1.2,2.3,3.6,4.9,5.9,6.0,7.0};
		
		return array;
		
	}

}
