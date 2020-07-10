package day11_ControlFlowStatements_Part4;

public class nestedForLoop2 {

	public static void main(String[] args) {


		for(int i=0;i<3;i++) {
			
			System.out.println("Outer Look at State: "+ i);
			
			for(int p=0;p<=3; p++) {
				System.out.println("Inner loop ate state: "+ p);
				
			    if(p==3) {
			    	System.out.println();
			    
			    }
			}
		}

	}

}
