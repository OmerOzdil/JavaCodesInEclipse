package day24_arrays_part1;

public class numberShow {

	public static void main(String[] args) {


		String number="a34575663231";
		
		for(int i=0; i<number.length(); i++) {
			
			System.out.println(number.charAt(i));
		}
		System.out.println(number.isEmpty());
		System.out.println(Character.isAlphabetic(number.charAt(0)));

	}

}
