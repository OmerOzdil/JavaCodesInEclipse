package day34_Constructor_Encapsulation;

public class DiceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES=6;
		final int TWENTY_SIDES=20;
		Dice sixDice =  new Dice(SIX_SIDES);
		Dice twentyDice = new Dice(TWENTY_SIDES);
		
		rollDice(sixDice);
		rollDice(twentyDice);
		

	}
	public static void rollDice(Dice d1) {

		System.out.println("Rolling a "+ d1.getSides() + " sided dice.");
		
		d1.roll();
		System.out.println("The dice's value: "+ d1.getValue());
	}

}
