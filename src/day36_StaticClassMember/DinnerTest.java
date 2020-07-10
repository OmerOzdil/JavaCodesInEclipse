package day36_StaticClassMember;

public class DinnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total slice: "+ Dinner.pizzaSlice);
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		System.out.println("Total slice: "+ Dinner.pizzaSlice);
		
		kid.takeASlice(3);
		dad.takeASlice(2);
		
		System.out.println("Total slice: "+ Dinner.pizzaSlice);
		System.out.println("Total slice: "+ mom.pizzaSlice);
	}

}
