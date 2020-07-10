package day13_methods_Part1;

public class deepAndDeeper {

	public static void main(String[] args) {


		System.out.println("I am statring in main");
		deep();
		System.out.println("Now i am back in the main");

	}
	public static void deep() {
		System.out.println("I am now in deep");
		deeper();
		System.out.println("I am back in deep");

		
	}
	public static void deeper() {
		
		System.out.println("I am now in deeper");
	}

}
