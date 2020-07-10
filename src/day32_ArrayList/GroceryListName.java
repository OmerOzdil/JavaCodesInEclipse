package day32_ArrayList;

import java.util.Scanner;

public class GroceryListName {
	
	static GroceryList groceryList = new GroceryList();
	static Scanner  scanner =  new Scanner(System.in);

	public static void main(String[] args) {
		
		
	
		printInstructions();
		
       boolean quit =false;
		
		while(!quit){
			
			System.out.print("Enter a choice: ");
			int num=scanner.nextInt();
			scanner.nextLine();
				
		switch(num) {
		case 0 :
			printInstructions();
			break;
		case 1:
			groceryList.printGroceryList();
			break;
		case 2:
			addItem();
			break;
		case 3:
			modifyItem();
			break;
		case 4:
			removeItem();
			break;
		case 5:
			searchItem();
			break;
		case 6:
			quit=true;
			break;	
		}
	}
		
}
	
	public static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To print  choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list.");
		System.out.println("\t 6 - To quit the application.");
			
	}
	public static void addItem() {
		System.out.println("Enter your grocery item: ");
		String item= scanner.nextLine();
		groceryList.addGroceryItemList(item);
	}
	public static void modifyItem() {
		System.out.print("Enter item number: ");
		
		int ItemNum=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter replacement item: ");
		String newItem=scanner.nextLine();  //nextLine basue we can use a empty between the words does not accept it.
		groceryList.modifyGroceryItem(ItemNum-1, newItem);
		
	}
	public static void removeItem() {
		System.out.println("Enter the removing item");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo-1);	
	}
	public static void searchItem() {
		
		System.out.println("Item to search for: ");
		String searchItem=scanner.nextLine();
		
		if(groceryList.findItem(searchItem)!=null) {
			System.out.println("Found "+  searchItem +" in your grocery list");
		} else {
			System.out.println(searchItem + " is not in your grocery list");
		}
		
	}
	
	
	
	

}
