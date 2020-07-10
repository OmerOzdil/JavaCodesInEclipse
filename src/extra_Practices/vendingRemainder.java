package extra_Practices;

public class vendingRemainder {

	public static void main(String[] args) {
		
		int price=25;          		// declare and initilase your variable;
		int Remainder= 100-price; 	// get the change by subtracting from 100;
		
		int quarters=Remainder/15;// finding amount of the quarters in the remainder.
		int afterQuarters= Remainder%15;
		System.out.println(afterQuarters);
		int dimes=afterQuarters/10;	// using modules to get the remainder after getting the quarters.
		int afterDimes=afterQuarters%10;
		System.out.println(afterDimes);
		int nickles=afterDimes/5;	// finding nickles by again using the modules.
		
		System.out.println("Your change is: "+quarters+" quarters "+ dimes+" dimes "+ nickles+ " nickles.");
		
		
		int a=3, b=2;
		long c = (a+b)*2/3%2;
		System.out.println(1/2+3/2+0.1);
	}

}
