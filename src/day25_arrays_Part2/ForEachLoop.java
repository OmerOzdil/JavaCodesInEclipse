package day25_arrays_Part2;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] products= {"Timberland","Shirt","watch","Bag","Shoes"};
		double[] prices= {120.0, 12.99, 13.9, 34.0, 34.5};
		
		
		for(int i=0; i<products.length; i++) {
			
			System.out.println(products[i]);
		}
		
		System.out.println("***********");
		
		for(String prod: products) {
			
			System.out.println(prod);
		}
		
		for(int i=0; i<prices.length; i++) {
				System.out.println(prices[i]);
		}
		System.out.println("************************");
		System.out.println(prices[2]);	
		System.out.println("***************************");
		for(double pri: prices) {
			System.out.println(pri);
		}
		
		
		System.out.println("-----------------------------------");
		for(int i=products.length-1; i>=0; i-- ) {
			System.out.println(products[i]);
		}
	}

}
