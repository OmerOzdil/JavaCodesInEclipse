package day4_arithmeticOperator;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This program calculates  the sale price of 
		//item  that is regularly at$59, with a 20% discount on it.
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*20;
		discount=discount/100;
		
		
		salesPrice=regularPrice-discount;
		System.out.println("regular price: $"+regularPrice);
		System.out.println("Discount price: $"+discount);
		
		System.out.println("The Sale Price of the item is: $"+ salesPrice);
		

	}

}
