package day10_ControlStatement_Part4;

public class task44 {

	public static void main(String[] args) {
		
		
		System.out.println("kph       mph");
		System.out.println("__________");
		double mph=1;
		System.out.println("");
		for(int kph=60; kph<=130; kph+=10) {
			
			System.out.println(kph+"          "+(mph=kph*0.6214));
		}

	}

}
