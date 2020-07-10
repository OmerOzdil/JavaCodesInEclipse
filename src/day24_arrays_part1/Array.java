package day24_arrays_part1;

public class Array {

	public static void main(String[] args) {
		
		double total=0;
		double[] myList= {10,30,40,50};
		
		String[] myArray={"Apple","Banana","Pear"};
		
		System.out.println(myList[0]);
		System.out.println(myList[3]);
		System.out.println(myArray[0]);
		System.out.println(myList.length);
		System.out.println(myArray.length);
	
		
		for(int i=0; i<myList.length;i++) {
			System.out.println(myList[i]);
			
			total=total+ myList[i];
				
		}
		System.out.println("sum is "+ total);
		System.out.println("Element is "+ myList.length);
		System.out.println(total/myList.length);

}}

