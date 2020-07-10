package day28_arrays_Lab;

public class Question18 {

	public static void main(String[] args) {
		
		int[] x = {1,2,78,65,78};
		System.out.println(thirteen(x));
		

	}
	public static int thirteen(int[] x) {
		int sum=0;
		for(int i=0; i<x.length; i++) {
			
			if(x[i]==13) {
				
				break;
			}
			
			sum=sum+x[i];	
		}
		return sum;
	}

}
