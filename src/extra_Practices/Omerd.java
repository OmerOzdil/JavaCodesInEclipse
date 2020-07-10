package extra_Practices;

import java.util.ArrayList;

public class Omerd {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<>();
		str.add("OMR");
		str.add("Ali");
		ArrayList<Omer>  omr = new ArrayList<>();
		
		Omer om	= new Omer("omer", 12,"UK");
		
		om.name="Al";
		
	
		
		omr.add(new Omer("Omer", 24, "Tr"));
		omr.add(new Omer("Kubra", 12, "Fr"));
		
		
		
		System.out.println(omr.get(1));
		
		System.out.println(str.toString());
	
		
		
		
	}

}
