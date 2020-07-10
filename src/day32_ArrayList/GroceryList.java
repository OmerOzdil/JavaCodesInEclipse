package day32_ArrayList;

import java.util.ArrayList;

public class GroceryList {

	ArrayList<String> groceyList = new ArrayList<>();
	
public void addGroceryItemList(String item) {
	groceyList.add(item);	
}
public void printGroceryList(){
	System.out.println("You have "+groceyList.size() +" items in your grocery list");
	for(int i=0; i<groceyList.size(); i++) {
		System.out.println((i+1)+ "."+ groceyList.get(i));
	}
}

public void modifyGroceryItem(int position, String newItem) {
	groceyList.set(position, newItem);
	System.out.println("Grocey item"+ (position+1)  + "has been modified");
}
public void removeGroceryItem (int position) {
	groceyList.remove(position);
}
public String findItem(String searchItem) {
	int position=groceyList.indexOf(searchItem);
	if(position>=0) {
		return groceyList.get(position);
		}
	return null;
}
}

