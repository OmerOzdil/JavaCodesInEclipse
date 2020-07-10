package day10_ControlStatement_Part4;

public class sumOfOddEvenNumber {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1; i<100; i+=1) {
			
			if (i%2==0) {
						
				sumEven=sumEven+i;
						
			}else{
				
				sumOdd=sumOdd+i;
				
			}
			
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
