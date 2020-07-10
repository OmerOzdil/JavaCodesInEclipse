package day19_StringManipulation_Part1;

public class task78 {

	public static void main(String[] args) {
		
		String Output="";
		String word="CybertekSchool";
		
		for(int i=0; i<word.length(); i++) {
			
			char vowel=word.charAt(i);
			
			if(vowel=='a' || vowel=='e' || vowel=='i'|| vowel=='u' || vowel=='o' ) {
				
				if(i!= word.length()-2)
				
				Output = Output+ vowel+",";
				
				
				}
			}
				
			System.out.println(Output);
		


	}

}
