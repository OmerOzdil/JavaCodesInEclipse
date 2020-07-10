package day31_ArrayList;

import java.util.*;

public class word {

	public static void main(String[] args) {

		ArrayList<String> word = new ArrayList();
		word.add("Omer");
		word.add("Ali");
		
		System.out.println(word);
		
		word.add(0, "Busra");
		System.out.println(word);
		

	}

}
