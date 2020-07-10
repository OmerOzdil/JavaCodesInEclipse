package day46_collections_Part2;

import java.util.*;

public class SortStudent {

	public static void main(String[] args) {
		
		List<Integer>  l1 = new ArrayList<>();
		l1.add(60);
		l1.add(50);
		l1.add(40);
		l1.add(10);
		l1.add(5);
		l1.add(1);
		l1.add(100);
		
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
		List<Student> stList = new ArrayList<>();
		stList.add(new Student(54, "Omer"));
		stList.add(new Student(56, "Ali"));
		stList.add(new Student(55, "Busra"));
		System.out.println(stList.toString());
		
		Collections.sort(stList);  // not applicable for this kind of class, you have to implements comparable.
		System.out.println(stList.toString());

	}

}
