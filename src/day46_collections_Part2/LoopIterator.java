package day46_collections_Part2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopIterator {

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
		System.out.println(nums);
		
		//1-Create Iterator object
		Iterator<Integer> it =nums.iterator();  // creating an objcet from iterator class.
		
		//2 hasNext, next Methods,
		//hasNext return true, If there is still next value, return false when it reaches end or empty
		// next() method return the current value and moves value.
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		
		

	}

}
