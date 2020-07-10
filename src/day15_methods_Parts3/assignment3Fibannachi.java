package day15_methods_Parts3;

public class assignment3Fibannachi {

	public static void main(String[] args) {
		
		
		int count=8;
		
		int pre1=0, pre2=1;
		System.out.println("Fibonacchi series of "+ count);
		
		for(int i=1;i<=count;i++) {
			
			System.out.print(pre2 + " ");
			
			int sumOfPreviousTwo=pre1+pre2;
			pre1=pre2;
			pre2=sumOfPreviousTwo;
		}

	}

}
