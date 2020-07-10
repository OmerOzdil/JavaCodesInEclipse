package day22_StringManipulation_Lab;

public class Question1 {

	public static void main(String[] args) {
		

		
		System.out.println(helloName("Bob"));
		
		System.out.println(helloName("Omer"));
	}
	
	public static String helloName(String Name) {
		
		
		String Hello="hello ";
		return Hello.concat(Name).concat("!");
	}

}
