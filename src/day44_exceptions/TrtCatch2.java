package day44_exceptions;

public class TrtCatch2 {

	public static void main(String[] args) {


		int [] nums= {1,25,98,12};
		
		try {
			System.out.println(nums[6]);
			
		}catch(Exception e) {
			
		System.out.println("Wrong index");
		}
		
		
		//int j=100; Arithmetic error.
		//int n=j/0;
		try {
			int j=100;
			int n=j/0;
		}catch(ArithmeticException e) {
			System.out.println("Can not / by zero");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
