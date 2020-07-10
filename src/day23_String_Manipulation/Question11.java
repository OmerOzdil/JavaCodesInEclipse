package day23_String_Manipulation;

public class Question11 {

	public static void main(String[] args) {
		
		
		System.out.println(countHi("abc hi hohi"));
		System.out.println(countHi("ABChi hi"));
		System.out.println(countHi("hihi"));
		
		
	}
	public static int countHi(String str) {
		
		int counter=0;
		
		for(int i=0; i<str.length()-1;i++) {
			
			String name=str.substring(i,i+2);
			
			if(name.equals("hi")) {
				counter+=1;
			}
		}
		return counter;
	}
	
	

}
