package Day26_arrays_Part3;

public class String_Manipulation_Arrays {

	public static void main(String[] args) {
		String[] MyCar= {"Honda","Mercedes","BMW","Toyota"," Ford "};
		
		System.out.println(MyCar[0].length());
		System.out.println(MyCar[1].charAt(1));
		System.out.println(MyCar[4].trim());
		System.out.println(MyCar[2].substring(2,3));
		
		System.out.println("--------------------------------");
		
		
		for(int i=0; i<MyCar.length; i++) {
			
			System.out.println(MyCar[i].length());
		}
	}

}
