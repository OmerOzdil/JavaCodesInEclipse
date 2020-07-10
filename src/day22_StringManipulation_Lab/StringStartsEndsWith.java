package day22_StringManipulation_Lab;

public class StringStartsEndsWith {

	public static void main(String[] args) {
		
		String word1="Eclipse";
		System.out.println(word1.startsWith("E"));
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("Ec"));
		
		
		String name="Mr. Busra";
		
		
		if(name.startsWith("Mr.")) {
			System.out.println("Married Man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("Married Woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("Some Woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else if(name.startsWith("")) {
			System.out.println("No Title");
		}
		

	}

}
