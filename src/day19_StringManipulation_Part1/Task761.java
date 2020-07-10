package day19_StringManipulation_Part1;

public class Task761 {

	public static void main(String[] args) {
		
		String str="Cybertek School";
		
		for(int i=0; i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
			System.out.println(str.charAt(i));
			}
			
		}

	}

}
