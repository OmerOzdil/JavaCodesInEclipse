package extra_Practices;

public class PracticeMethod {

	public static void main(String[] args) {


		String word="ab4uig5429";
		extractNum(word);
		
		System.out.println(extractNum(word));
		
	}
	public static String extractNum(String para) {
		String str="";
		for(int i=0; i<para.length();i++) {
			
			if(Character.isDigit(para.charAt(i))) {
				str=str+para.charAt(i);	
			}
		}
		return str;	
	}

}
