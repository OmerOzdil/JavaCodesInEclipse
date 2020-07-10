package day28_arrays_Lab;

public class Question16 {

	public static void main(String[] args) {
		int[] x = {2,3,7,8,4};
		int counter=0;
		
		for(int i=0; i<x.length; i++) {
			
			if(i%2==0) {
			counter++;	
				
			}
		}

		System.out.println(counter);
	}

}
