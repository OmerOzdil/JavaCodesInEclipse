package day45_collections;


import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<Integer>  list = new LinkedList<>();
		
		list.add(50);
		list.add(500);
		System.out.println(list.get(0));
		System.out.println(list.contains(50));
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(70);
		System.out.println(list);

	}

}
