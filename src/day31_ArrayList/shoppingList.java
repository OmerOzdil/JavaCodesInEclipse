package day31_ArrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("Paper towel");
		shoppingList.add("Dish soap");
		shoppingList.add("Trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		System.out.println(shoppingList.size());
		// pring each element in single line
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.get(0) + " " + shoppingList.get(5));
		
		shoppingList.remove("Paper towel");
		shoppingList.remove("shovel");
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.get(0));
		
		
		shoppingList.remove(0);
		System.out.println(shoppingList.get(0));
		
		
		
		
		
		

	}

}
