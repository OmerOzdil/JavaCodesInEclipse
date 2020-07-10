package extra_Practices;

import java.util.Scanner;

public class massAndWeight {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter the mass of the object: ");
		
		double mass=sc.nextDouble();
		
		double weight=mass*9.8;
		System.out.println("The weight is "+ weight+ "N");
		
		if(weight<10) {
			System.out.println("The objcet is too light.");
		}else if(weight>1000) {
			System.out.println("The object is too heavy.");
		}
	
	}

}
