package day45_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class ArrayVsArrayList {

	public static void main(String[] args) {
		
	//Array are fixed size.
		//Allows duplicate
		int[] numsArray = {20,50,501,90};
		String[] days= new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		
		System.out.println(Arrays.toString(numsArray));
		System.out.println(Arrays.toString(days));
		ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(45);
		numList.add(34);
		System.out.println(numList.toString());
		
		

	}

}
