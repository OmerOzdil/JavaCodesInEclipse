package extra_Practices;

import java.util.Scanner;

public class internetPackages {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter your package type: ");
		
		String type=sc.nextLine();
		
		System.out.print("Please enter number of hours usage: ");
		int hours=sc.nextInt();
		
		double constantPayment;
		double totalBill;
		
		if(type.equalsIgnoreCase("A")) {
			
			constantPayment=9.95;
			if(hours>10) {
				totalBill= constantPayment + (hours-10)*2;
				System.out.println("Your packet type is : "+ type + " and your total bill is: "+ totalBill+ "$");		
			}else {
				totalBill=constantPayment;
				System.out.println("Your packet type is : "+ type + " and your total bill is: "+ totalBill+ "$");
			}
		}else if(type.equalsIgnoreCase("B")) {
			constantPayment=13.95;
			if(hours>20) {
				totalBill=constantPayment+(hours-20)*1;
				System.out.println("Your packet type is : "+ type + " and your total bill is: "+ totalBill+ "$");	
			}else {
				totalBill=constantPayment;
				System.out.println("Your packet type is : "+ type + " and your total bill is: "+ totalBill+ "$");
			}
		}else if (type.equalsIgnoreCase("C")) {
				constantPayment=19.95;
				totalBill=constantPayment;
				System.out.println("Your packet type is : "+ type + " and your total bill is: "+ totalBill+ "$");	
		}else 
			System.out.println("In valid Packet");
		
	}
	

}
