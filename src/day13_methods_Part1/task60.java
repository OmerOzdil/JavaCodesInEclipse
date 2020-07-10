package day13_methods_Part1;

public class task60 {

	public static void main(String[] args) {
		
		calculator(10,20, "-");

	}
	public static void calculator( double number1, double number2, String Operator) {
		
		switch(Operator) {
		case"*":
			System.out.println(number2*number1);
			break;
		case"+":
			System.out.println(number1+number2);
			break;
		case"-":
			System.out.println(number1-number2);
			break;
		default:
			System.out.println("No valid operator");
			
		}
		
	}

}
