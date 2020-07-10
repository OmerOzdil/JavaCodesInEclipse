package day32_ArrayList;

import java.util.ArrayList;

public class equalsMethods {

	public static void main(String[] args) {


		ArrayList<String>  friends1 = new ArrayList<>();
		ArrayList<String>  friends2 = new ArrayList<>();
		
		friends1.add("Mike");
		friends1.add("Smith");
		friends1.add("John");
		friends1.add("Tommy");

		friends2.add("Mike");
		friends2.add("Smith");
		friends2.add("John");
		friends2.add("Tommy");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if(friends1.equals(friends2)) {     // checking f or the values means elements
			System.out.println("Smae friends");
		}else {
			System.out.println("Diffrent friends");
		}
		
		System.out.println(friends1==friends2);
	}

}
