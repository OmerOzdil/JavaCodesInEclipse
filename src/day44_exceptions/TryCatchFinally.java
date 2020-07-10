package day44_exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
	
		
		
		String str="Selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		}catch(Exception e) {
			System.out.println("Ebter correct index");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Finally block");    // it executes in every situations.
		}
		System.out.println("Hello");
	}

}
