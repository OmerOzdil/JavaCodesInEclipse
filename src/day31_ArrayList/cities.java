package day31_ArrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Londra");
		cities.add("Virginia");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Istabul");
		cities.add("DC");
		System.out.println(cities.toString());
		
		System.out.println("----------------------");
		
		
		//print each city by using forr loop
		
		for( String city: cities) {
			
			System.out.println(city);
			
		}
		
		//print each v=city for iterator loop
		
		System.out.println("----------------------");
		
		for(int i=0;i<cities.size(); i++) {
			
			System.out.println(cities.get(i));
		}
		
		System.out.println("Removing baku from the list");
		
		cities.remove("Baku");
		System.out.println(cities.toString());
		
		cities.add(0,"Arlington");
		cities.add(1,"Newyork");
		
		System.out.println(cities.toString());
		
		cities.add(2,"Ankara");
		System.out.println(cities.toString());
		
		System.out.println("-------------------");
		
		int idx = cities.indexOf("Istabul");
		System.out.println(cities.indexOf("Istabul"));
		System.out.println(idx);
		
		System.out.println(cities.indexOf("Bursa"));
		
		
		System.out.println("--------------");
		
		cities.clear();
		
		System.out.println(cities.isEmpty());
		
		System.out.println(cities.toString());
	}

}
