
package day19_StringManipulation_Part1;

public class String_Contains {

	public static void main(String[] args) {
		
		String email="test@gmail.com";
		
		System.out.println(email.contains("@"));
		
		String list="tomatoes, apple, cucumber, eggs, milk, cereal, meat";
		
		if(list.contains("eggs")) {
			
			System.out.println("egg in your shop list");
		}else {
			
			System.out.println("Soory not in the list");
		}
		
		boolean hasEgg=list.contains("eggs");
		
		System.out.println("Contains egg: "+ hasEgg);
		
		boolean hasPear=list.contains("pear");
		
		System.out.println("Contains pear: "+ hasPear);
		
		email="name@yahoo.com";
		
		if(email.contains("@yahoo.com")) {
			System.out.println("yahoo account");
		}else if(email.contains("gmail.com")) {
			System.out.println("gmail account");
		}else if(email.contains("hotmail account")) {
			
		}
			
		String etsyTitle="Car | Etsy";
		
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		

	}

}
