package day31_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList<String> omr = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		
		names.add("Mike");
		names.add("Omer");
		names.add("Busra");
		names.add("Kubra");
		
		nums.add(45);
		nums.add(200);
		nums.add(34);
		nums.add(new Integer("100"));
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println("Nums count: "+ nums.size());
		System.out.println("Numbers count: "+ names.size());

	}

}
