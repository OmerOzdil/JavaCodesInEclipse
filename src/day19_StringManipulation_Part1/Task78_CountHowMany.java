package day19_StringManipulation_Part1;

public class Task78_CountHowMany {

	public static void main(String[] args) {


		int counter=0;
		char MyChar='h';
		
		String str="anitabahhuoa";
		
		for(int i=0; i<str.length();i++) {
			
			char name=str.charAt(i);
			
			if (name==MyChar) {
				
				counter+=1;
			}
		}
		
     System.out.println("Count for "+ MyChar+ " is "+ counter);
	}

}
