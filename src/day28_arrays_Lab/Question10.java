package day28_arrays_Lab;

public class Question10 {

	public static void main(String[] args) {
		
		int[] x = {2,2};
		int[] y = {2,3};
		int[] z = {3,3};
		int[] k = {2,3,5,65};
		System.out.println(checkTwoAndThree(x));
		System.out.println(checkTwoAndThree(y));
		System.out.println(checkTwoAndThree(z));
		System.out.println(checkTwoAndThree(k));
		
		

	}
	public static boolean checkTwoAndThree(int[] x) {
		
		int counter2=0;
		int counter3=0;
		
		for(int value: x) {
			if(value==2) {
				counter2++;
			}else if(value==3) {
				counter3++;
			}
		}
		if(counter2==2 || counter3==2) {
			return true;
		}else 
			return false;	
	}

}
