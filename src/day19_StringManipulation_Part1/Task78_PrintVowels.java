
package day19_StringManipulation_Part1;

public class Task78_PrintVowels {

	public static void main(String[] args) {
		
		String Output="";
		String word="CybertekSchool";
		
		for(int i=0; i<word.length(); i++) {
			
			char vowel=word.charAt(i);
			
			if(vowel=='a' || vowel=='e' || vowel=='i'|| vowel=='u' || vowel=='o' ) {
				
				
				System.out.print(vowel);
				
				if(i!=word.length()-2) {
					
					System.out.print(",");
				}
			}
				
			
		}

		
	}

}
