package day31_ArrayList;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums= new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(100);
		nums.add(200);
		nums.add(34);
		nums.add(76);
		nums.add(98);
		
		System.out.println(nums.toString());
		nums.remove(2);
		System.out.println(nums.toString());
		
		Integer n1= new Integer(98);
		
		Integer n2 = Integer.valueOf(98);
		
		nums.remove(n1);
		System.out.println(nums.toString());

	}

}
