package day19_StringManipulation_Part1;

public class String_Concat {

	public static void main(String[] args) {
		
		String word="Java";
		
		System.out.println(word.concat("+ selenium"));
		System.out.println(word.concat("in eclipse"));
		System.out.println(word.concat("1224"));
		
		System.out.println(word);
		
		word=word.concat("+ selenium");
		
		System.out.println(word);
		
		System.out.println(word.concat(" in eclipse"));
		
		
		word= word+ 123;
		System.out.println(word);
		
		String word2="He";
		word2=word2.concat("-hey").concat("-How are you").concat("-good");
		System.out.println(word2);
	}

}
