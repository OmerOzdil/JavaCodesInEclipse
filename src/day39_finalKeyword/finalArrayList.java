package day39_finalKeyword;

import java.util.ArrayList;

public class finalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		
		COLORS.add("Orange");
		COLORS.add("Yello");
		COLORS.add("Whie");
		
		//COLORS = new ArrayList<String>(); // if it is final you can not refer to new object.
		COLORS.add("black");

	}

}
