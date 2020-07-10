package day32_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class costumMethod {

	public static void main(String[] args) {


		ArrayList<Integer>  numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		ArrayList<Double> d2 = new ArrayList<>();
		d2.add(10.33);
		d2.add(1.22);
		d2.add(7.34);
		d2.add(3.55);
		d2.add(4.76);
		
		
		double sum = sumList(d2);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer>  list = getList(15);
		
		System.out.println(list);
		
		ArrayList<Integer>  rList = randomList(20);
		
		System.out.println(rList.toString());
		
		
		ArrayList<String>  strnums=  new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		
		ArrayList<Integer> converted= converToList(strnums);
		System.out.println(converted.toString());
		
		
		
	}
	public static void printList(ArrayList<Integer> nums) {
		
		for( Integer n: nums) {
			System.out.println(n+ " ");
		}
	}

	public static double sumList(ArrayList<Double> d3) {
		
		double total=0;
		for(Double sum: d3) {
			total= total+sum;	
		}
		return total;
		
		
	}
	
	public static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i=1; i<=size; i++) {
			
			newList.add(i);
			
			
		}
		return newList;
	}
	
	public static ArrayList<Integer> randomList(int size){
		
		Random r = new Random();
		
		
		ArrayList<Integer>  randomNums =  new ArrayList<>();
		
		for(int i=1; i<size;i++) {
			
			randomNums.add(r.nextInt(101));
		}
		
		return randomNums;
		
		
	}
	
	public static ArrayList<Integer> converToList(ArrayList<String> strList){
		
		ArrayList<Integer>  newList =  new ArrayList<>();
		
		for(String str: strList) {
			
			newList.add(Integer.parseInt(str));
		}
		
		return newList;
	}
	
	
	
}
