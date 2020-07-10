package day7_ControlFlowStatements;

public class RevenueTask {

	public static void main(String[] args) {
		double revenue, price, discount=0, quantity;
		
		price=500;
		
		quantity=2;
		
		revenue=price*quantity;
		
		
		if(revenue>5000) {
			discount=revenue*0.1;
			revenue=revenue-discount;			
		}
		System.out.println("your new revenue is "+ revenue+" and your discount is "+ discount );			
	}

}
