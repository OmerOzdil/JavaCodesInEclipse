package day13_methods_Part1;

public class loopMethod {

	public static void main(String[] args) {
		
		System.out.println("hello from the main method");
		for(int i=0; i<5;i++) {
			displayMessage();
		System.out.println("Back in the main method");
			
			
		}

	}

	public static void displayMessage() {
		System.out.println("hello from the displayMessage method");
		
	}

}
