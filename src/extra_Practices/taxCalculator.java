package extra_Practices;

import java.util.Scanner;

public class taxCalculator {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your income: ");
		
		double income= sc.nextDouble();
		double taxAmount;
		
		if(income<=150000000) {
			 taxAmount= income*0.25;
			 System.out.println("The tax amount that you have to pay: "+ taxAmount);		
		}else if(income>=150000000 && income<300000000) {
			taxAmount=150000000*0.25 + (income-150000000)*0.30;
			System.out.println("The tax amount that you have to pay: "+ taxAmount);
		}else if(income>=300000000 && income<600000000) {
			taxAmount=150000000*0.25 + (300000000-150000000)*0.35+ (income-300000000);
			System.out.println("The tax amount that you have to pay: "+ taxAmount);	
		}else if(income>=600000000 && income<1200000000) {
			taxAmount=150000000*0.25 +(300000000-150000000)*0.35 +(income-600000000)*0.40;
			System.out.println("The tax amount that you have to pay: "+ taxAmount);		
		}else if(income>1200000000) {
			taxAmount=150000000*0.25 +(300000000-150000000)*0.35 +(1200000000-600000000)*0.40+ (income-1200000000)*0.5;
			System.out.println("The tax amount that you have to pay: "+ taxAmount);
		}
	}

}
