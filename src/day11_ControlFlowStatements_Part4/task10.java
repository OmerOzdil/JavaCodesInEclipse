package day11_ControlFlowStatements_Part4;

public class task10 {

	public static void main(String[] args) {
		
		
		
		int sumEven=0;
		
		for(int i=0;i<=100;i++ ) {
			
			if(i%2==0) {
				sumEven=sumEven+i;
			}
		}
		System.out.println(sumEven);
		
	}

}
