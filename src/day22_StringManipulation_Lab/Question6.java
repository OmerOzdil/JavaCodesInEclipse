package day22_StringManipulation_Lab;

public class Question6 {

	public static void main(String[] args) {


		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Java"));
		System.out.println(withoutEnd("coding"));

	}
	public static String withoutEnd(String str) {
		
		return str.substring(1,str.length()-1);
	}

}
