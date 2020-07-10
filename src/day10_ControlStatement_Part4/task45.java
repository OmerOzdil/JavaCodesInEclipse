package day10_ControlStatement_Part4;

public class task45 {

	public static void main(String[] args) {
		
		
		int num1=50;
		int num2=10;
		int repeat=5;
		
		for(int i=1; i<=5; i+=1) {
			if(num1>num2) {
				System.out.println("Num1 is greater than Num2");
			}else if(num2>num1) {
				System.out.println("Num2 is greater than Num1");
			}else if (num1==num2) {
				System.out.println("Num is equal to Num2");
		}else {
				System.out.println("None is correct");
			}
		}
			
			
				 
				
				

	}

}
