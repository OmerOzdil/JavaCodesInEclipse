package day44_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		
		try {
			String str= "Java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));   // wont stop here it directly jump to catch and execute there then go to next line 
			System.out.println(str.charAt(1));	
		}catch(Exception e) {
			System.out.println("Exception happened in try block and was cought");	
		}	
		System.out.println("After try catch block");
		
		

	}

}
