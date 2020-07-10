package day13_methods_Part1;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		System.out.println("Let`s see the conversion of Fah to Cel");
		FahrenheitToC(75);
	}
	public static void FahrenheitToC(double Fah) {
		
		double Cel=(Fah-32)*5/9;
		System.out.println(Fah+ "H is " +Cel+"C");
		
	}

}
