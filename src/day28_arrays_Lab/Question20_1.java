package day28_arrays_Lab;

public class Question20_1 {

	public static void main(String[] args) {
		
	        int[] n = new int[]{2, 3, 4,6, 556, 4, 234, 56,7, 1, 3};
	        int result = 0;
	        int sum = 0;
	        for (int i = 0; i < n.length; i++) {
	            result += n[i];
	            if (n[i] == 6) {

	                for (int j = i; j < n.length; j++) {
	                    sum += n[j];
	                    if (n[j] == 7) {
	                        break;
	                    }
	                }
	            }


	        } System.out.println(result-sum);
	    }
	}