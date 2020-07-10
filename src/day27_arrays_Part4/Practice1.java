package day27_arrays_Part4;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
      
		
		String [] names;
		
		
		for( String values: createArray(3)){
			
			System.out.println(values);
		}
		System.out.println(createArray(3)[0]);
		
	}
	public static String[] createArray(int size) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String[] arr = new String[size];
		for(int i=0; i<arr.length; i++) {
			
			System.out.print("Please a name: ");
			arr[i]=sc.nextLine();
			
		}
		return arr;
	}
	
	

}
