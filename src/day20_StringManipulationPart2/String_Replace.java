package day20_StringManipulationPart2;

public class String_Replace {

	public static void main(String[] args) {
		String sentence="coding is fun, it is my hoppy";
		System.out.println(sentence);
		
		String withoutNoSpace=sentence.replace(" ", "");
		System.out.println(withoutNoSpace);
		
		String noComma=sentence.replace("," , "!!!!");
		System.out.println(noComma);
		
		String mixed="*^$%£%&$%&";
		mixed=mixed.replace("*^$%", "");
		System.out.println(mixed);

		
		
	}

}
