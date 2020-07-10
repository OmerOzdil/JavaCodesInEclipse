package day46_collections_Part2;

import java.util.*;

public class SetEaxmple {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(100);

		mySet.add(900);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(1000);
		System.out.println(mySet);
		System.out.println(mySet.size());
		
		//List<String> list = new Arrays.asList("23","23","a","a","bb","jj","q","t","t");
		
		//Set<String> unique = new HashSet<>(list);
		
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(500);
		tSet.add(100);
		tSet.add(5);
		tSet.add(800);
		tSet.add(700);
		tSet.add(700);
		System.out.println(tSet);
		
		
		
		
		

	}

}
