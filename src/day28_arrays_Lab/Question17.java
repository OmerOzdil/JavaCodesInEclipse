package day28_arrays_Lab;

public class Question17 {

	public static void main(String[] args) {
		
		int[] x = {10,2,5,89};
		
		
		System.out.println(difference(x));
		

	}
	public static int difference(int[] x) {
		int biggest=0;
		int smallest=x[0];
		
		
		
		for(int i=0; i<x.length; i++) {
			
			if(biggest<x[i]) {
				
				biggest=x[i];
			}
			
			if(smallest>=x[i]) {
			smallest=x[i];
			}
		}
		
		return biggest-smallest;
		
	}

}
