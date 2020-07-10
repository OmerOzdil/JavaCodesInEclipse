package day11_ControlFlowStatements_Part4;

public class CreateAPattern {

	public static void main(String[] args) {
	
		
		
		int rows=6;
		int coloums=5;
		for(int i=0; i<=rows; i++) {
			
			for(int j=0; j<=coloums; j++) {
				System.out.print("*");
				
				if(j==5) {
					System.out.println();
				}
				
			 
			}
			
		}

	}

}
