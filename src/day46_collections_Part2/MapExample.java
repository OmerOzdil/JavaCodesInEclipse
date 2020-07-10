package day46_collections_Part2;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Double> items = new HashMap<>();
		items.put("Apple", 3.49);
		items.put("Flower",4.66);
		items.put("Orange", 2.44);
		items.put("Milk", 5.44);
		//items.put("Milk", 5.00);  // Key has to be unique.
		
		System.out.println(items.size());
		System.out.println(items.get("Apple"));
		
		System.out.println(items);
		System.out.println(items.isEmpty());
		
		items.remove("Apple");
		System.out.println(items);
		System.out.println("Is apple in the list ?"+ items.containsKey("Apple"));
		
		items.replace("Orange", 3.55);
		System.out.println("Price of Orange :"+ items.get("Orange"));
		
		
		//increase Milk price by $2
		
		items.replace("Milk",items.get("Milk")+2);
		
		System.out.println(items.get("Milk"));
		

	}

}
