package day31_ArrayList;

import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class containsMethod {

	public static void main(String[] args) {
		
		
		ArrayList<String>  list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("March");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		
		ArrayList<String> list2 = list1;
		
		ArrayList<String> months =  new ArrayList<String>(list1);
		
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		System.out.println(months);
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		
		System.out.println(months.indexOf("Feb"));
		
		System.out.println(months.get(1).equals("Feb"));
		System.out.println(months.get(1).equalsIgnoreCase("feb"));
		
		if(months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some values are missing");
		}
		
		if(months.contains("Feb")) {
			System.out.println("Contain it");
		}else {
			System.out.println("Not there");
		}
		
		
	}

}
