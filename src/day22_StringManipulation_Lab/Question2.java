package day22_StringManipulation_Lab;

public class Question2 {

	public static void main(String[] args) {


		
		System.out.println(makeAbba("Hi", "Bye"));

	}
	
	public static String makeAbba(String a, String b) {
		
		return a+b+b+a;
		
		
	}

}
