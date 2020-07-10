package day46_collections_Part2;

import java.util.*;

public class LoopSet {

	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<>();
		nums.add(50);
		nums.add(540);
		nums.add(5115);
		nums.add(550);
		nums.add(90);
		nums.add(30);
		nums.add(20);
		nums.add(10);
		
		System.out.println(nums.size());
		System.out.println(nums);
		
		
		//for each loop for printig the element.
		for(int n: nums) {
			System.out.print(n+" | ");
		}
		
			// for iterator is not allowed since there is preservation.
			//for(int i=0; i<nums.size(); i++) {
			
			//System.out.print(nums.get(i)+ "|");
			//}	
		System.out.println();
		
		nums.forEach(n -> System.out.print(n + " | "));

	}

}
