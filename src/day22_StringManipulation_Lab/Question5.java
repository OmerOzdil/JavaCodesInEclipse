package day22_StringManipulation_Lab;

public class Question5 {

	public static void main(String[] args) {
		
		

		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("Omer"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("Omerw"));
	}
	public static String firstHalf(String Str) {
		
		if(Str.length()%2!=0) {
			return "Invalid Number of String";
			
		}else {
			
			return Str.substring(0, Str.length()/2);
		}
			
	}

}
