package day11_ControlFlowStatements_Part4;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<=5;i++) {
			System.out.println("Outer Loop Iteration"+ i);
			
			for(int j=1; j<=2; j++) {
				
				System.out.println("i ="+ i+"; j ="+ j);
				
				for(int a=1; a<=1;a+=1) {
					System.out.println("Congratulations");
				}
			}
	     }

	}

}
