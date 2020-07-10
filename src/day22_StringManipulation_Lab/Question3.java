package day22_StringManipulation_Lab;

public class Question3 {

	public static void main(String[] args) {
		
		
	System.out.println(extraEnd("My name is omer"));
	System.out.println(extraEnd("a"));
	System.out.println(extraEnd("Sakarya"));
	}
	
	public static String extraEnd(String str) {
		
		if(str.length()<2) {
			System.out.println("Invalid word");		
		}
			
		String dummy="";
		
		dummy=str.substring(str.length()-2);
			return dummy+ dummy+dummy;
		}


}
