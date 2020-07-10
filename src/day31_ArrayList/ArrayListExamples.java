package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {

		ArrayList<String> Languages = new ArrayList<>();
		
		
		
		Languages.add("Turkish");
		Languages.add("Enlish");
		Languages.add("Swalili");
		Languages.add("Polish");
		Languages.add("Arabic");
		String name =Languages.get(0);
		System.out.println(name);
		
		System.out.println("Number of values: "+ Languages.size());
		System.out.println(Languages.toString());

		
		Languages.add("Russian");
		System.out.println(Languages.toString());
		Languages.remove(0);
		System.out.println(Languages);
		
		System.out.println(Languages.toString());
		
	}

}
