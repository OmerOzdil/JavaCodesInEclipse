package day36_StaticClassMember;

public class CalculatorTest {

	public static void main(String[] args) {


		double result = Calculator.plus(55, 7);
		System.out.println("Result: "+ result);
		
		Calculator c= new Calculator();
		
		System.out.println(c.plus(45, 34));
		int i = Integer.parseInt("3");
		System.out.println(Character.isAlphabetic('a'));
		

	}

}
