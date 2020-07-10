package day44_exceptions;

public class Nullpointer {
	
	static String name;

	public static void main(String[] args) {
		
		//System.out.println(name.toUpperCase());
		
		try {
			System.out.println(name.toUpperCase());	
		}catch(NullPointerException e) {
			System.out.println("NullpointerException happened");
			System.out.println("Here is the message"+ e.getMessage());
			System.out.println("Here is the stackTracer");
			e.printStackTrace();
		}		
	}

}
