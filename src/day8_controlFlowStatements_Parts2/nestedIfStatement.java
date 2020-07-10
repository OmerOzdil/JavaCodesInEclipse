package day8_controlFlowStatements_Parts2;

public class nestedIfStatement {

	public static void main(String[] args) {
		
		
		boolean isRushhour=true;
		int carType=1;
		double price=0.0;
		
		if(carType==1) {
			if(isRushhour) {
				System.out.println("price=30.0");}
			 }else {
				System.out.println("price=5.0");
		 } if (carType==2) {
				if(isRushhour) { 
				System.out.println("price=55.9;");
				}
		     }else {
				System.out.println("price=15.0");
				
			
		}
		

	}

}
