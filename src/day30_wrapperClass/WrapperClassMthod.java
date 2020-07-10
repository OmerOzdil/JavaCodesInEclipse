package day30_wrapperClass;

public class WrapperClassMthod {

	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Character.isAlphabetic('a')); // since this method return type is boolean so it appears as true or false
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isLetter('j'));
		System.out.println(Character.isLetter('&'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('b'));
		
		String word="java101";
		
		System.out.println(Character.isAlphabetic(word.charAt(0)));
		System.out.println(Character.isAlphabetic(word.charAt(6)));
	}

}
