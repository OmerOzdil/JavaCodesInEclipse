package day22_StringManipulation_Lab;

public class Question19 {

	public static void main(String[] args) {
		

		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("Omer"));
		System.out.println();
		
	}
	public static boolean frontAgain(String str) {
		
		String first2=str.substring(0,2);
		String last2=str.substring(str.length()-2);
		
		if(first2.equals(last2)) {
			return true;
		}else
			return false;
	}

}
