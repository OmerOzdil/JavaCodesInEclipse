package day22_StringManipulation_Lab;

public class Question9 {

	public static void main(String[] args) {


		
		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));
		System.out.println(right2("Hi"));
		System.out.println(right2("Sakarya"));

	}
	public static String right2(String str) {
		return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
		
	}

}
